package org.example;

import java.util.Arrays;
import java.util.List;

public class ColourTable {
    public ColourTable(int size) {
        List<Integer> validInputSizes = Arrays.asList(2,4,8,16,32,64,128,256,512,1024);
        if (!validInputSizes.contains(size)) {
            throw new IllegalArgumentException("Invalid Size Input");
        }
    }
}
