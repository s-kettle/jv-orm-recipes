package org.example.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Image {

    @Id
    @GeneratedValue
    long id;

    String filename;
    String fileData;

    @OneToOne
    Recipe recipe;

    public Image(){}

    public Image(String filename, String fileData, Recipe recipe) {
        this.filename = filename;
        this.fileData = fileData;
        this.recipe = recipe;
    }
}
