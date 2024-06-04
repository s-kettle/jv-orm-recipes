package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue
    long id;

    String name;

    public Category(){}

    public Category(String name) {
        this.name = name;
    }
}
