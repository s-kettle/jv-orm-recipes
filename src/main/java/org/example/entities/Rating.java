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

    public Rating(User rater,int value, Date dateRated, Recipe recipe) {
        this.rater = rater;
        this.value = value;
        this.dateRated = dateRated;
        this.recipe = recipe;
    }
}
