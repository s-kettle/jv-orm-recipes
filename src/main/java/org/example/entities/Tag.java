package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tag {

    @Id
    @GeneratedValue
    long id;

    String name;


    public Tag(){}

    public Tag(String name) {
        this.name = name;
    }
}
