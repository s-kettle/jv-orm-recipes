package org.example.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue
    long id;

    String name;

    @ManyToMany()
    List<Recipe> recipes;

    public Category(){}

    public Category(String name) {
        this.name = name;
    }
}
