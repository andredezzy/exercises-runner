package me.andredezzy.exercisesrunner.exercises.one;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Three implements Exercise {
    public void run(String[] args) {
        System.out.print("Informe o número de repetições: ");
        int loopCount = Application.ASKER.askForInt();

        System.out.println();

        for (int i = 0; i < loopCount; i++) {
            System.out.printf("Repetição Nº: %d%n", i);
        }
    }
}
