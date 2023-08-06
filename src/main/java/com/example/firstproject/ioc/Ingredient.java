package com.example.firstproject.ioc;

public abstract class Ingredient {
    private String name;

    public String getName() {
        return name;
    }

    protected Ingredient(String name) {
        this.name = name;
    }
}
