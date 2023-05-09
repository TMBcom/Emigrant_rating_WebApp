package org.Conmiro.TrackingSys.Repos;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.Conmiro.TrackingSys.Models.TrackingModel;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class TrackingFileWorker implements ITrackingFileWorker {
    private List<TrackingModel> TrackingsDataList = new ArrayList<>();
    private static String YamlFile_Path = "D:\\UniPractice\\TrackingSys\\src\\main\\resources\\TrackingsData.yml";

    ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    private long idCount=1;
    public TrackingFileWorker() throws IOException {
        try
        {
            TrackingsDataList = objectMapper.readValue(new File(YamlFile_Path), new TypeReference<>() {});
            for (TrackingModel TrackData: TrackingsDataList)
            {
                if (TrackData.getId() >= idCount)
                {
                    idCount = TrackData.getId()+1;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Async
    public List<TrackingModel> getTrackingData()
    {
        return TrackingsDataList;
    }

    @Async
    public TrackingModel findTrackById(long id)
    {
        for (TrackingModel TrackData : TrackingsDataList)
        {
            if (TrackData.getId() == id)
            {
                return TrackData;
            }
        }
        return null;
    }

    @Async
    public void add(TrackingModel TrackData)
    {
        TrackData.setId(idCount++);
        TrackingsDataList.add(TrackData);
        save();
    }

    @Async
    public void update(TrackingModel TrackData)
    {
        for (int i = 0; i < TrackingsDataList.size(); i++)
        {
            if (TrackingsDataList.get(i).getId() == TrackData.getId())
            {
                TrackingsDataList.set(i, TrackData);
                save();
            }
        }
    }

    @Async
    public void delete(long id)
    {
        TrackingsDataList.removeIf(wagon -> wagon.getId() == id);
        save();
    }

    private void save()
    {
        try
        {
            objectMapper.writeValue(new File(YamlFile_Path), TrackingsDataList);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
