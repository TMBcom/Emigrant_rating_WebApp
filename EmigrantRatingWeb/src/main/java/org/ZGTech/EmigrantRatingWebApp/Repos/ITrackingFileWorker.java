package org.ZGTech.EmigrantRatingWebApp.Repos;

import org.ZGTech.EmigrantRatingWebApp.Models.TrackingModel;

import java.util.List;

public interface ITrackingFileWorker {
    public List<TrackingModel> getTrackingData();
    public TrackingModel findTrackById(long id);
    public void add(TrackingModel TrackData);
    public void update(TrackingModel TrackData);
    public void delete(long id);
}
