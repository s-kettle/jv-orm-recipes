package org.example;

import org.example.entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {

    static List<Ingredient> ingredients = new ArrayList<>();

    public static SessionFactory getSessionFactory(){
        return new Configuration()
                //Add annotations for class
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Users.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Ingredient.class)
                .addAnnotatedClass(Rating.class)
                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Tag.class)

                // use H2 in-memory database
                .setProperty(URL, "jdbc:h2:mem:db1")
                // default username / password
                .setProperty(USER, "sa")
                .setProperty(PASS, "")
                .setProperty("hibernate.agroal.maxSize", "20")

                // options to display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .buildSessionFactory();
    }

    public static void seed(){
        var sessionFactory = getSessionFactory();

        sessionFactory.inTransaction(session -> {

            Ingredient ingredient1 = new Ingredient("Cheese", 2, "slices" );
            Ingredient ingredient2 = new Ingredient("Bread", 2, "slices" );
            Ingredient ingredient3 = new Ingredient("Butter", 5, "grams" );
            Ingredient ingredient4 = new Ingredient("Jalapenos", 5, "peppers" );

            session.persist(ingredient1);
            session.persist(ingredient2);
            session.persist(ingredient3);
            session.persist(ingredient4);

            session.flush();

            session.refresh(ingredient1);
            session.refresh(ingredient2);
            session.refresh(ingredient3);
            session.refresh(ingredient4);

            ingredients.add(ingredient1);
            ingredients.add(ingredient2);
            ingredients.add(ingredient3);
            ingredients.add(ingredient4);

            var ingredientWithID = ingredient3.id;
            var ingredientWithIDName = ingredient3.name;

            System.out.println(ingredientWithID + ingredientWithIDName);
        });

        sessionFactory.inTransaction(session -> {
            Recipe grilledCheese = new Recipe(
                    LocalDate.now(),
                    LocalDate.now(),
                    null,
                    null,
                    ingredients,
                    null,
                    1,
                    1,
                    10,
                    "Put cheese on bread, add jalapenos",
                    5,
                    "Delicious cheese sandwich",
                    "Grilled Cheese");

            session.persist(grilledCheese);
            session.flush();
            session.refresh(grilledCheese);

        });

        sessionFactory.inTransaction(session -> {

            Users newUser = new Users(
                    "jimmyrai321",
                    "jr@northcoders.co.uk",
                    "SecretPass",
                    Role.ADMIN,
                    LocalDate.now(),
                    null,
                    null,
                    null
            );

            session.persist(newUser);
            session.flush();
            session.refresh(newUser);

        });
    }

}
