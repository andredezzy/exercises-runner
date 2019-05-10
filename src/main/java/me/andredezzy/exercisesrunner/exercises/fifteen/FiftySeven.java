package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FiftySeven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para 'A': ");
        double a = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para 'B': ");
        double b = Application.ASKER.askForDouble();

        boolean isMultiple = a % b == 0;

        System.out.print("\n> ");
        if (isMultiple) {
            System.out.println(String.format("%s É multiplo de %s", a, b));
        } else {
            System.out.println(String.format("%s NÃO multiplo de %s", a, b));
        }
    }
}
