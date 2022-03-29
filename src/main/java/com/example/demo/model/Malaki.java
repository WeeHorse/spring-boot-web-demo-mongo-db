package com.example.demo.model;

public class Malaki {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Malaki(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
