package org.ZGTech.EmigrantRatingWebApp.Service;

import org.ZGTech.EmigrantRatingWebApp.Models.TrackingModel;
import org.ZGTech.EmigrantRatingWebApp.Repos.ITrackingFileWorker;
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
