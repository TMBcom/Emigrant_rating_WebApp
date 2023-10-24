package org.ZGTech.EmigrantRatingWebApp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.annotation.processing.Generated;

@Data
@Entity
@Table(name="person")
public class TempModelClass {
    @Id
    private int id;

    private String name;

}
