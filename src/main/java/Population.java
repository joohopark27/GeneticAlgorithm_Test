package main.java;

public class Population {

    private Individual[] speicies;
    private static final int POP_SIZE = 10;
    private final double winnerPercent = 0.2;
    private final double randomPercent = 0.1;

    private int generation;
    private final int MAX_GENERATION = 10;

    public Population(){

        speicies = new Individual[POP_SIZE];
        for(int i = 0; i < POP_SIZE; i++){

            speicies[i] = new Individual();

        }

        generation = 1;

        while (generation < MAX_GENERATION){

            print();

        }

        print();

    }

    private void print(){

        System.out.println("Generation: " + generation);
        for(Individual individual: speicies){

            individual.print();
            System.out.print(" ");

        }

    }

}
