package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;

public class Rating {

    @Id
    @GeneratedValue
    long id;

    int value;
    Date dateRated;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe recipe;

    @ManyToOne(fetch = FetchType.LAZY)
    User rater;

    public Rating(){}

    public Rating(Date dateRated, int value, Recipe recipe, User rater) {
        this.dateRated = dateRated;
        this.value = value;
        this.recipe = recipe;
        this.rater = rater;
    }
}
