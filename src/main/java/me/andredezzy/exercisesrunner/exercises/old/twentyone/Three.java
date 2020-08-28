package me.andredezzy.exercisesrunner.exercises.old.twentyone;

import java.util.Arrays;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Three implements Exercise {

    public void run(String[] args) {
        int[] values = new int[16];

        for (int i = 0; i < 16; i++) {
            values[i] = i;
        }

        System.out.println("-> Vetor inicial: " + Arrays.toString(values));

        for (int i = 0; i < 8; i++) {
            int backupValue = values[i];

            values[i] = values[i + 8];
            values[i + 8] = backupValue;
        }

        System.out.println("-> Vetor final (invertido): " + Arrays.toString(values));
    }
}
