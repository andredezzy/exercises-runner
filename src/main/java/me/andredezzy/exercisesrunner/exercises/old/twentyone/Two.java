package me.andredezzy.exercisesrunner.exercises.old.twentyone;

import java.util.Arrays;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Two implements Exercise {

    public void run(String[] args) {
        int[] oddNumbers = new int[10];

        int count = 0;
        for (int i = 0; count < 10; i++) {
            if ((i % 2) != 0) {
                oddNumbers[count] = i;
                
                count++;
            }
        }

        System.out.println("-> Primeiros 10 números ímpares (vetor): " + Arrays.toString(oddNumbers));
    }
}
