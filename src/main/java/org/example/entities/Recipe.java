package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    long id;

    String title;
    String description;
    String instructions;
    int preparationTime;
    int cookingTime;
    int servings;
    int difficultyLevel;
    int rating;

    @ManyToOne(fetch = FetchType.LAZY)
    List<Ingredient> ingredients;

    @ManyToOne(fetch = FetchType.LAZY)
    List<Category> categories;

    @ManyToOne(fetch = FetchType.LAZY)
    User creator;

    Date dateCreated;
    Date lastModified;

}
