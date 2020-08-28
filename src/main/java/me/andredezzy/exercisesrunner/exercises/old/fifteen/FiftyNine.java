package me.andredezzy.exercisesrunner.exercises.old.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FiftyNine implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um número: ");
        int number = Application.ASKER.askForInt();

        boolean isPair = number % 2 == 0;
        boolean isNegative = number < 0;

        System.out.println("\n> Par ou Ímpar? " + (isPair ? "par!" : "ímpar!"));
        System.out.println("> Negativo ou Positivo? " + (isNegative ? "negativo [-]" : "positivo [+]"));
    }
}
