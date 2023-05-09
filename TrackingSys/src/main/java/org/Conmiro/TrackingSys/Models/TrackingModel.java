package org.Conmiro.TrackingSys.Models;



import lombok.Data;


@Data

public class TrackingModel {

    private long id;
    private String title;
    private String description;
    private String citySender;
    private String cityRecipient;
    private String author;
    private long dateOfDispatch;

}
