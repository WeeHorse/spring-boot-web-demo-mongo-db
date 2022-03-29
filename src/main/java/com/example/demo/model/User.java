package com.example.demo.model;

public class User {
    private String username;
    private String userId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User(String username, String userId) {
        this.username = username;
        this.userId = userId;
    }
}
