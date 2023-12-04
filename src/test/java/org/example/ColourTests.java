package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTests {
    @Test
    public void colourConstructorThrowsOnInvalidRedInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Colour(457,210,76);
        });
    }
    @Test
    public void colourConstructorThrowsOnInvalidGreenInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Colour(45,2104,76);
        });
    }
    @Test
    public void colourConstructorThrowsOnInvalidBlueInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Colour(45,210,764);
        });
    }
    @Test
    public void successfullyCreatesValidColour() {
        Colour colour = new Colour(35,210,56);
        assertEquals(35, colour.getRed());
        assertEquals(210, colour.getGreen());
        assertEquals(56, colour.getBlue());

    }
}
