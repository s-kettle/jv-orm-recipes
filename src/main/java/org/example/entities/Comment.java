package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    long id;

    String text;
    Date datePosted;

    @ManyToOne(fetch = FetchType.LAZY)
    User author;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe recipe;

    public Comment(){}

    public Comment(Date datePosted, String text, User author, Recipe recipe) {
        this.datePosted = datePosted;
        this.text = text;
        this.author = author;
        this.recipe = recipe;
    }
}
