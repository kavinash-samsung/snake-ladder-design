package com.example.service;

import java.util.Random;

public class DiceService {
    static Random random = new Random();
    public static int rollDice(int noOfDice){
        return random.nextInt(noOfDice*6) + 1;
    }
}
