package org.Conmiro.TrackingSys.Repos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.Conmiro.TrackingSys.Models.ProductModel;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductFileWorker implements  IProductFileWorker {
    private List<ProductModel> ProductsDataList = new ArrayList<>();
    private static String YamlFile_Path = "D:\\UniPractice\\TrackingSys\\src\\main\\resources\\ProductInfo.yml";

    ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    private long idCount=1;
    public ProductFileWorker() throws IOException {
        try
        {
            ProductsDataList = objectMapper.readValue(new File(YamlFile_Path), new TypeReference<>() {});
            for (ProductModel ClientData: ProductsDataList)
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
    public List<ProductModel> getClientData()
    {
        return ProductsDataList;
    }

    @Async
    public ProductModel findClientById(long id)
    {
        for (ProductModel clientData : ProductsDataList)
        {
            if (clientData.getId() == id)
            {
                return clientData;
            }
        }
        return null;
    }

    @Async
    public void add(ProductModel clientData)
    {
        clientData.setId(idCount++);
        ProductsDataList.add(clientData);
        save();
    }

    @Async
    public void update(ProductModel clientData)
    {
        for (int i = 0; i < ProductsDataList.size(); i++)
        {
            if (ProductsDataList.get(i).getId() == clientData.getId())
            {
                ProductsDataList.set(i, clientData);
                save();
            }
        }
    }

    @Async
    public void delete(long id)
    {
        ProductsDataList.removeIf(wagon -> wagon.getId() == id);
        save();
    }

    private void save()
    {
        try
        {
            objectMapper.writeValue(new File(YamlFile_Path), ProductsDataList);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
