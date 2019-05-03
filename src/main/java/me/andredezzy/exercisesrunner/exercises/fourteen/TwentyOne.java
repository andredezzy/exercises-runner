package me.andredezzy.exercisesrunner.exercises.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe o valor de 'A': 2
    Informe o valor de 'B': 2

    A^2 | A * A: 4.0
    B^2 | B * B: 4.0

    > 8.0
*/
public class TwentyOne implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor de 'A': ");
        int a = Application.ASKER.askForNumber();

        System.out.print("Informe o valor de 'B': ");
        int b = Application.ASKER.askForNumber();

        double aSquare = Math.pow(a, 2);
        double bSquare = Math.pow(b, 2);

        System.out.println("\nA^2 | A * A: " + aSquare);
        System.out.println("B^2 | B * B: " + bSquare);

        System.out.println("\n> " + (aSquare + bSquare));
    }
}
