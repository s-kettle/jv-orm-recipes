package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    public long id;

    public String title;
    String description;
    String instructions;
    int preparationTime;
    int cookingTime;
    int servings;
    int difficultyLevel;
    @OneToMany
    List<Rating> ratings;
    @ManyToMany
    List<Ingredient> ingredients;
    @ManyToMany
    List<Category> categories;
    @ManyToOne(fetch = FetchType.LAZY)
    Users creator;


    LocalDate dateCreated;
    LocalDate lastModified;
    public Recipe(){}

    public Recipe(LocalDate lastModified, LocalDate dateCreated, Users creator, List<Category> categories, List<Ingredient> ingredients, List<Rating> rating, int difficultyLevel, int servings, int cookingTime, String instructions, int preparationTime, String description, String title) {
        this.lastModified = lastModified;
        this.dateCreated = dateCreated;
        this.creator = creator;
        this.categories = categories;
        this.ingredients = ingredients;
        this.ratings=rating;
        this.difficultyLevel = difficultyLevel;
        this.servings = servings;
        this.cookingTime = cookingTime;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.description = description;
        this.title = title;
    }
}
