package org.example.entities;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.Date;
import java.util.Set;

public class User {

    private long id;
    private String username;
    private String email;
    private String password;
    private Role role;
    private Date dateRegistered;

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "user")
    private Set<Rating> ratings;

    @OneToMany(mappedBy = "user")
    private Set<Recipe> recipes;

}
