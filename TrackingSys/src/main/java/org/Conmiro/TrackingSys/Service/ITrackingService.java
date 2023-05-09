package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.TrackingModel;

import java.util.List;

public interface ITrackingService {

    public List<TrackingModel> listTracks();

    public void saveTrack(TrackingModel product);


    public void deleteTrack(long id);

    public TrackingModel getTrackById(long id);

    public void updateTrack(TrackingModel product);
}
