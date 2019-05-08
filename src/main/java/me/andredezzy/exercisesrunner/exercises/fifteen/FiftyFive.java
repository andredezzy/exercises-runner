package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FiftyFive implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para prova 'A': ");
        double a = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para prova 'B': ");
        double b = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para prova 'C': ");
        double c = Application.ASKER.askForDouble();
        
        
    }
}
