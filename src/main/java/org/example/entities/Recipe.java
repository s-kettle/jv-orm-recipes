package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    List<Ingredient> ingredients;
    List<Category> categories;
    @ManyToOne(fetch = FetchType.LAZY)
    User creator;

    LocalDate dateCreated;
    LocalDate lastModified;
    public Recipe(){}

    public Recipe(LocalDate lastModified, LocalDate dateCreated, User creator, List<Category> categories, List<Ingredient> ingredients, int rating, int difficultyLevel, int servings, int cookingTime, String instructions, int preparationTime, String description, String title) {
        this.lastModified = lastModified;
        this.dateCreated = dateCreated;
        this.creator = creator;
        this.categories = categories;
        this.ingredients = ingredients;
        this.rating = rating;
        this.difficultyLevel = difficultyLevel;
        this.servings = servings;
        this.cookingTime = cookingTime;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.description = description;
        this.title = title;
    }
}
