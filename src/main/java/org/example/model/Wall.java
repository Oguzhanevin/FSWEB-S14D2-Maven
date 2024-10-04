package org.example.model;

public class Wall {
    // Instance variable
    private String direction;

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // Getter for direction
    public String getDirection() {
        return direction;
    }

    // create method
    public void create() {
        System.out.println("Wall has been built.");
    }
}
