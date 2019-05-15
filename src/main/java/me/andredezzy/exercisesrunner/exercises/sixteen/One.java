package me.andredezzy.exercisesrunner.exercises.sixteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class One implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um número: ");
        int number = Application.ASKER.askForInt();

        if(number >= 0) {
            boolean isPair = (number % 2) == 0;

            System.out.printf("%n> %s é %s", number, isPair ? "par" : "ímpar");
        } else {
            System.out.println(String.format("%n> O número informado (%s) não é positivo!", number));
        }
    }
}
