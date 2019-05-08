package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FiftyThree implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para 'A': ");
        double a = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para 'B': ");
        double b = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para 'C': ");
        double c = Application.ASKER.askForDouble();
        
        // TODO
    }
}