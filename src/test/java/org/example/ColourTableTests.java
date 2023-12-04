package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTableTests {
    @Test
    public void constructorDoesNotThrowOnValidInput() {
        int[] validSizes = {2,4,8,16,32,64,128,256,512,1024};
        for (int size : validSizes) {
            new ColourTable(size);
        }
    }

    @Test
    public void constructorThrowsOnInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ColourTable(3);
        });
    }
}
