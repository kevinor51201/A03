package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ColourTableTests {
    @Test
    public void colourTableConstructorDoesNotThrowOnValidInput() {
        int[] validSizes = {2,4,8,16,32,64,128,256,512,1024};
        for (int size : validSizes) {
            new ColourTable(size);
        }
    }

    @Test
    public void colourTableConstructorThrowsOnInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ColourTable(3);
        });
    }

    @Test
    public void addMethodSuccessfullyAddsColoursWhileBelowCapacity() {
        ColourTable colourTable = new ColourTable(2);
        colourTable.add(new Colour(252,87,96));
        colourTable.add(new Colour(253,86,94));
        assertEquals(2,colourTable.getTableSize());
    }

    @Test
    public void addMethodThrowsWhenOverCapacity() {
        ColourTable colourTable = new ColourTable(2);
        colourTable.add(new Colour(252,87,96));
        colourTable.add(new Colour(253,86,94));
        assertThrows(Error.class, () -> {
            colourTable.add(new Colour(243, 83, 93));
        });
    }
}
