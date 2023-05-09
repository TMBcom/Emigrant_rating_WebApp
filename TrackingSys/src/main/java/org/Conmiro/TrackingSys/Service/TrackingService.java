package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.TrackingModel;
import org.Conmiro.TrackingSys.Repos.ITrackingFileWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingService implements ITrackingService {
    @Autowired
    private ITrackingFileWorker TrackingDataRepository;
    @Async
    public List<TrackingModel> listTracks(){
        return TrackingDataRepository.getTrackingData();}

    @Async
    public void saveTrack(TrackingModel track){
        TrackingDataRepository.add(track);
    }
    @Async
    public void deleteTrack(long id){
        TrackingDataRepository.delete(id);
    }

    @Async
    public TrackingModel getTrackById(long id){
        return TrackingDataRepository.findTrackById(id);
    }
    @Async
    public void updateTrack(TrackingModel track){TrackingDataRepository.update(track);
    }
}
