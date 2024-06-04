package org.example;

import org.example.repository.RecipeRepository;

public class Main {
    public static void main(String[] args) {

        var session = Database.getSessionFactory();
        session.getSchemaManager().exportMappedObjects(true);

        Database.seed();

        RecipeRepository.getAllRecipesWithIngredient();

    }
}