package main.java;

import java.sql.SQLOutput;
import java.util.Random;

public class Individual implements Comparable<Individual>{

    private static final int SIZE = 10;
    private static final int RANGE = 2;
    private static final double MUTATION_RATE = 0.01;

    private int[] data;

    public Individual(){

        Random rand = new Random();
        data = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
            data[i] = (int) (rand.nextDouble() * RANGE);
        }

    }

    @Override
    public String toString(){

        String string = "[" + data[0];

        for(int i = 1; i < data.length; i++){

            string += ", " + data[i];

        }

        return string + "]";

    }

    public int score(){

        int score = 0;

        for(int i: data){

            score += i;

        }

        return score;
    }

    @Override
    public int compareTo(Individual o) {
        return o.score() - score();
    }
}
