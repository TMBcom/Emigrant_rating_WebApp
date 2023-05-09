package org.Conmiro.TrackingSys.Repos;

import org.Conmiro.TrackingSys.Models.TrackingModel;

import java.util.List;

public interface ITrackingFileWorker {
    public List<TrackingModel> getTrackingData();
    public TrackingModel findTrackById(long id);
    public void add(TrackingModel TrackData);
    public void update(TrackingModel TrackData);
    public void delete(long id);
}
