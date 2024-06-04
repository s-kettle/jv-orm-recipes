package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    long id;

    String name;
    int quantity;
    String unitOfMeasurement;

    @OneToMany(mappedBy = "ingredient")
    Recipe recipe;

}
