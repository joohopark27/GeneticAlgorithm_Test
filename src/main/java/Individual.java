package main.java;

import java.sql.SQLOutput;
import java.util.Random;

public class Individual {

    public static final int SIZE = 10;
    private int[] data;
    private final int range = 2;
    private int score;

    public Individual(){

        Random rand = new Random();
        data = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
            data[i] = (int) (rand.nextDouble() * range);
        }

    }

    public void print(){

        System.out.print("[" + data[0]);

        for(int i = 1; i < data.length; i++){

            System.out.print(", " + data[i]);

        }

        System.out.print("]");

    }

    public int score(){

        score = 0;

        for(int i: data){

            score += i;

        }

        return score;
    }

}
