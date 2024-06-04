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
//        var sessionFactory = getSessionFactory();
//        sessionFactory.inTransaction(session -> {
//            Ingredient ingredient1 = new Ingredient("Cheddar Cheese",2,"slices");
//            Ingredient ingredient2 = new Ingredient("White Bread",2,"slices");
//            Ingredient ingredient3 = new Ingredient("Butter",1,"10g");
//            Ingredient ingredient4 = new Ingredient("Jalapenos",5,"one unit");
//            session.persist(ingredient1);
//            session.persist(ingredient2);
//            session.persist(ingredient3);
//            session.persist(ingredient4);
//
//            List<Ingredient> grilledCheeseList = new ArrayList<>();
//            grilledCheeseList.add(ingredient1);
//            grilledCheeseList.add(ingredient2);
//            grilledCheeseList.add(ingredient3);
//            grilledCheeseList.add(ingredient4);
//
//            Users testUsers = new Users("Sam321","Samk@gmail.com","password",Role.ADMIN, LocalDate.now(),null,null,null);
//            session.persist(testUsers);
//            List<Category> categoryList = List.of(new Category("Sandwiches"));
//            session.persist(new Recipe(LocalDate.now(),LocalDate.now(), testUsers,categoryList,grilledCheeseList,0,1,2,10,"Google it",3,"Quick and delicious Grilled Cheese","Grilled Cheese Sandwich"));
//        });
    }

}
