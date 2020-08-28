package me.andredezzy.exercisesrunner.exercises.old.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe um valor inteiro: 2

    > 2^2: 4.0
    > 2^3: 8.0
*/
public class Nineteen implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor inteiro: ");
        int integerValue = Application.ASKER.askForInt();
        
        System.out.println(String.format("%n> %s^2: %s", integerValue, Math.pow(integerValue, 2)));
        System.out.println(String.format("> %s^3: %s", integerValue, Math.pow(integerValue, 3)));
    }
}
