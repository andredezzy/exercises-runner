package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class ThirtyThree implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor da primeira prova: ");
        double firstTest = Application.ASKER.askForDouble();
        
        System.out.print("Informe o valor da segunda prova: ");
        double secondTest = Application.ASKER.askForDouble();
        
        System.out.print("Informe o valor da terceira prova: ");
        double thirdTest = Application.ASKER.askForDouble();
        
        double testsAverage = ((firstTest * 2) + (secondTest * 3) + (thirdTest * 5)) / (2 + 3 + 5);
        
        System.out.println("\n> Média: " + testsAverage);
    }
}