package org.Conmiro.TrackingSys.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductModel {

    private Long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;

}
