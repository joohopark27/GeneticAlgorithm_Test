package main.java;

import java.util.Arrays;

public class Population {

    private Individual[] species;
    private int generation;

    private static final int POP_SIZE = 10;
    private static final double SUVIVAL_PERCENT = 0.2;
    private final int MAX_GENERATION = 10;

    public Population(){

        species = new Individual[POP_SIZE];
        for(int i = 0; i < POP_SIZE; i++){

            species[i] = new Individual();

        }

        generation = 1;

        while (generation < MAX_GENERATION){

            print();
            Arrays.sort(species);
//            species = nextGeneration();

            generation++;

        }

        print();

    }

    private void print(){

        System.out.println("Generation: " + generation);
        for(Individual individual: species){

            System.out.print(individual + " ");

        }
        System.out.println("\n");

    }

}
