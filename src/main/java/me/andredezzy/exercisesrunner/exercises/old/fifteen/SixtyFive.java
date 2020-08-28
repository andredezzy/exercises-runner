package me.andredezzy.exercisesrunner.exercises.old.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class SixtyFive implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor da nota 'A': ");
        int a = Application.ASKER.askForInt();

        System.out.print("Informe o valor da nota 'B': ");
        int b = Application.ASKER.askForInt();

        boolean isApproved = false;

        if (a > 5 && b > 5) {
            isApproved = true;
        }

        System.out.println("\n> Aprovado? " + (isApproved ? "SIMMM :D" : "... não :("));
    }
}
