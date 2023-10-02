package org.ZGTech.EmigrantRatingWebApp.Models;



import lombok.Data;

import java.util.Date;


@Data

public class TrackingModel {

    private long id;
    private String title;
    private String description;
    private String citySender;
    private String cityRecipient;
    private String author;
    private String dateOfDispatch;

}
