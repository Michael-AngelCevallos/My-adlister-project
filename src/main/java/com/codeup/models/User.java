package com.codeup.models;

import com.codeup.util.Password;

public class User {

    private long id;
    private String username;

    private String gender;

    private String email;
    private String password;

    public User() {}

    public User(String username, String gender, String email, String password) {
        this.username = username;
        this.gender = gender;
        this.email = email;
        setPassword(password);
    }

    public User(long id, String username, String gender, String email, String password) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        this.password = Password.hash(password);
    }
}

