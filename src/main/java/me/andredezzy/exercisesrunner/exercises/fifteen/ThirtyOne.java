package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class ThirtyOne implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para 'A': ");
        int a = Application.ASKER.askForInt();

        System.out.print("Informe um valor para 'B': ");
        int b = Application.ASKER.askForInt();

        if (a > b) {
            System.out.println("\n> 'A' contém o maior valor -> " + a);
        } else {
            System.out.println("\n> 'B' contém o maior valor -> " + b);
        }
    }
}
