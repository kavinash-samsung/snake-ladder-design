package com.example.util;

import java.util.Random;

public class DiceUtil {
    public static int getDiceValue(){
        Random random = new Random();
        int max = 6;
        int min = 1;
        return random.nextInt(max-min+1) + min;
    }
}
