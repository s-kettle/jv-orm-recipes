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


    public Recipe(){}




    public Recipe( String title, String description, String instructions, int preparationTime, int cookingTime, int servings, int difficultyLevel, int rating, List<Ingredient> ingredients, List<Category> categories, User creator, Date dateCreated, Date lastModified) {
        this.title = title;
        this.description = description;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.rating = rating;
        this.ingredients = ingredients;
        this.categories = categories;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.lastModified = lastModified;
    }
}
