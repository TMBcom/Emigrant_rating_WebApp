package org.Conmiro.TrackingSys.Models;



import lombok.Data;


@Data

public class ProductModel {

    private long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;

}
