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

    public Ingredient(){}

    public Ingredient(String name, int quantity, String unitOfMeasurement) {
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
