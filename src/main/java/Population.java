package main.java;

import java.util.Arrays;

public class Population {

    private Individual[] species;
    private int generation;

    private static final int POP_SIZE = 10;
    private static final double SURVIVAL_PERCENT = 0.2;
    private final int MAX_GENERATION = 10;

    public Population(){

        species = new Individual[POP_SIZE];
        for(int i = 0; i < POP_SIZE; i++){

            species[i] = new Individual();

        }

        generation = 1;
        print();

    }

    public void evolve(){

        while (generation < MAX_GENERATION){

            Arrays.sort(species);
            species = nextGeneration();

            generation++;
            print();

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

    private Individual[] nextGeneration(){

        Individual[] nextGen = new Individual[POP_SIZE];

        for(int i = 0; i < nextGen.length; i++){

            Individual parent1 = species[(int) (Math.random() * POP_SIZE * SURVIVAL_PERCENT)];
            Individual parent2 = species[(int) (Math.random() * POP_SIZE * SURVIVAL_PERCENT)];

            nextGen[i] = Individual.crossOver(parent1, parent2);

        }

        return nextGen;
    }
}
