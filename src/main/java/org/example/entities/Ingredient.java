package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    public long id;

    public String name;
    int quantity;
    String unitOfMeasurement;
    @ManyToMany
    List<Recipe> recipes;

    public Ingredient(){}

    public Ingredient(String name, int quantity, String unitOfMeasurement) {
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
