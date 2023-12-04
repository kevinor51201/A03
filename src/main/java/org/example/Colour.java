package org.example;

public class Colour {
    private final int red;
    private final int blue;
    private final int green;

    public Colour(int red, int green, int blue) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("Invalid Colour Input");
        }
        if (green < 0 || green > 255) {
            throw new IllegalArgumentException("Invalid Colour Input");
        }
        if (blue < 0 || blue > 255) {
            throw new IllegalArgumentException("Invalid Colour Input");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public int getRed() {
        return red;
    }
    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }

}
