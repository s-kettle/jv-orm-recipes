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
    Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe recipe;

    public Comment(){}

    public Comment(Date datePosted, String text, Users users, Recipe recipe) {
        this.datePosted = datePosted;
        this.text = text;
        this.users = users;
        this.recipe = recipe;
    }
}
