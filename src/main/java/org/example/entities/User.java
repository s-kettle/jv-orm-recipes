package org.example.entities;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public class User {

    private long id;
    private String username;
    private String email;
    private String password;
    private Role role;
    private LocalDate dateRegistered;

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "user")
    private Set<Rating> ratings;

    @OneToMany(mappedBy = "user")
    private Set<Recipe> recipes;

    public User(){}

    public User(String username, String email, String password, Role role, LocalDate dateRegistered, Set<Comment> comments, Set<Rating> ratings, Set<Recipe> recipes) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
        this.comments = comments;
        this.ratings = ratings;
        this.recipes = recipes;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
