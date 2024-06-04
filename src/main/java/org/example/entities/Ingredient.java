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

    public Ingredient(){}

    public Ingredient(String name, int quantity, String unitOfMeasurement, Recipe recipe) {
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
        this.recipe = recipe;
    }


}
