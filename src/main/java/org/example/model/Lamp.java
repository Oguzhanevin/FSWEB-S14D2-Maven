package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // getGlobRating method
    public int getGlobRating() {
        return globRating;
    }

    // getStyle method
    public LampType getStyle() {
        return style;
    }

    // isBattery method (this is the new method that was missing)
    public boolean isBattery() {
        return battery;
    }

    // other methods
    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }
}
