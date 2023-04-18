package org.Conmiro.TrackingSys.Repos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import  org.Conmiro.TrackingSys.Models.ClientModel;



@Repository
public class FileWorker implements  IFileWorker {
    private List<ClientModel> ClientDataList = new ArrayList<>();
    private static String YamlFile_Path = "D:\\UniPractice\\TrackingSys\\src\\main\\resources\\TrackingInfo.yml";

    ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    private int idCount=1;
    public FileWorker () throws IOException {
        try
        {
            ClientDataList = objectMapper.readValue(new File(YamlFile_Path), new TypeReference<>() {});
            for (ClientModel ClientData: ClientDataList)
            {
                if (ClientData.getId() >= idCount)
                {
                    idCount = ClientData.getId()+1;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Async
    public List<ClientModel> getClientData()
    {
        return ClientDataList;
    }

    @Async
    public ClientModel findClientById(Integer id)
    {
        for (ClientModel clientData : ClientDataList)
        {
            if (clientData.getId() == id)
            {
                return clientData;
            }
        }
        return null;
    }

    @Async
    public void add(ClientModel clientData)
    {
        clientData.setId(idCount++);
        ClientDataList.add(clientData);
        save();
    }

    @Async
    public void update(ClientModel clientData)
    {
        for (int i = 0; i < ClientDataList.size(); i++)
        {
            if (ClientDataList.get(i).getId() == clientData.getId())
            {
                ClientDataList.set(i, clientData);
                save();
            }
        }
    }

    @Async
    public void delete(Integer id)
    {
        ClientDataList.removeIf(wagon -> wagon.getId() == id);
        save();
    }

    private void save()
    {
        try
        {
            objectMapper.writeValue(new File(YamlFile_Path), ClientDataList);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
