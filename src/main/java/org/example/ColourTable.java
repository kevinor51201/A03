package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ColourTable {
    private final int size;
    private int currentKey = 0;
    HashMap<Integer,Colour> table = new HashMap<>();
    public ColourTable(int size) {
        List<Integer> validInputSizes = Arrays.asList(2,4,8,16,32,64,128,256,512,1024);
        if (!validInputSizes.contains(size)) {
            throw new IllegalArgumentException("Invalid Size Input");
        }
        this.size = size;

    }

    public void add (Colour colour) {
        if (currentKey == size) {
            throw new Error("Can not insert. Table is at capacity.");
        }
        else {
            table.put(currentKey,colour);
            currentKey+=1;
        }
    }

    public int getTableSize() {
        return currentKey;
    }
}
