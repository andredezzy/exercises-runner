package me.andredezzy.exercisesrunner.exercises.one;

import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Three implements Exercise {
    public void run(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d ", i);
        }
    }
}
