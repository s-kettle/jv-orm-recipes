package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    long id;

    int ratingValue;
    Date dateRated;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe recipe;

    @ManyToOne(fetch = FetchType.LAZY)
    Users rater;

    public Rating(){}

    public Rating(Date dateRated, int ratingValue, Recipe recipe, Users rater) {
        this.dateRated = dateRated;
        this.ratingValue = ratingValue;
        this.recipe = recipe;
        this.rater = rater;
    }
}
