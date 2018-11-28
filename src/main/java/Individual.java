package main.java;

import java.sql.SQLOutput;
import java.util.Random;

public class Individual implements Comparable<Individual>{

    private static final int SIZE = 10;
    private static final int RANGE = 2;
    private static final double MUTATION_RATE = 0.1;

    private int[] data;

    public Individual(){

        Random rand = new Random();
        data = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
            data[i] = (int) (rand.nextDouble() * RANGE);
        }

    }

    public Individual(int[] data){

        this();

        if(data.length == SIZE) {
            this.data = data;
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

    private int score(){

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

    private int getData(int i){
        return data[i];
    }

    public static Individual crossOver(Individual parent1, Individual parent2){

        int[] child = new int[SIZE];

        for(int i = 0; i < child.length; i++){

            child[i] = (Math.random() < 0.5) ? parent1.getData(i) : parent2.getData(i);

        }

        return new Individual(child);

    }

    public void mutate(){

        for(int i = 0; i < SIZE; i++){
            data[i] = (Math.random() < MUTATION_RATE) ? (int)(Math.random() * RANGE) : data[i];
        }

    }

}
