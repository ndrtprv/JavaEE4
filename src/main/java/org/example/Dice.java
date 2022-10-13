package org.example;

import java.util.Arrays;
import java.util.Random;

public class Dice {
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int rollStats() {
        int [] result = new int[6];
        int i;
        for (i = 0; i < result.length; i++) {
            result[i] = roll();
        }
        Arrays.sort(result);
        return result[3] + result[4] + result[5];
    }
}