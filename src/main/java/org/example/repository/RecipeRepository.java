package org.example.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import org.example.Database;
import org.example.entities.Ingredient;
import org.example.entities.Recipe;

import java.util.List;

public class RecipeRepository {

    public static List<Recipe> getAllRecipesWithIngredient() {

        var sessionFactory = Database.getSessionFactory();
        sessionFactory.inTransaction(session -> {
            List<Recipe> recipes = session.createQuery(
                    "select r " +
                            "from Recipe r " +
                            "where Ingredient.id = 1",
                    Recipe.class)
                    .getResultList();
        });

        return null;
    }
}
