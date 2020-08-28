package me.andredezzy.exercisesrunner.exercises.old.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FortySeven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para 'A': ");
        double a = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para 'B': ");
        double b = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para 'C': ");
        double c = Application.ASKER.askForDouble();

        System.out.println();

        String smallestValue = "A -> " + a;

        if (b < a && b < c) {
            smallestValue = "B -> " + b;
        } else if (c < a && c < b) {
            smallestValue = "C -> " + c;
        }
        
        System.out.println("\n> O menor valor é: " + smallestValue);
    }
}
