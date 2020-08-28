package me.andredezzy.exercisesrunner.exercises.old.challenges;

import java.util.Random;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class SortArray implements Exercise {

    private static final int NUMBERS_LIMIT = 100;

    public void run(String[] args) {
        int numbers[] = new int[NUMBERS_LIMIT];
        int backupNumber;

        Random random = new Random();

        for (int i = 0; i < NUMBERS_LIMIT; i++) {
            numbers[i] = random.nextInt(((NUMBERS_LIMIT * 10) - 0) + 1) + 0;
        }

        for (int i = 0; i < NUMBERS_LIMIT; i++) {
            for (int j = (i + 1); j < NUMBERS_LIMIT; j++) {
                if (numbers[i] > numbers[j]) {
                    backupNumber = numbers[i];
                    
                    numbers[i] = numbers[j];
                    numbers[j] = backupNumber;
                }
            }
        }

        System.out.print("Ascending Order (ordem crescente): \n- ");
        for (int i = 0; i < (NUMBERS_LIMIT - 1); i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.print(numbers[NUMBERS_LIMIT - 1]);

    }
}
