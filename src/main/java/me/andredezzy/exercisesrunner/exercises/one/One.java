package me.andredezzy.exercisesrunner.exercises.one;

import me.andredezzy.exercisesrunner.exercises.Exercise;

public class One implements Exercise {
    public void run(String[] args) {
        int number8 = 8;
        int number9 = 9;
        int number7 = 7;

        double average1 = (number8 + number9 + number7) / 3d;

        System.out.printf("Média aritmética dos números 8, 9 e 7: %.2f%n", average1);

        int number4 = 4;
        int number5 = 5;
        int number6 = 6;

        double average2 = (number4 + number5 + number6) / 3d;

        System.out.printf("Média aritmética dos números 4, 5 e 6: %.2f%n", average2);

        System.out.printf("A soma das duas médias é: %.2f%n", (average1 + average2));
        System.out.printf("A média aritmética das médias é: %.2f%n", ((average1 + average2) / 2));
    }
}
