package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class ThirtySeven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe a idade para calcular os meses e dias diante dos anos vividos: ");
        int age = Application.ASKER.askForNumber();
        
        int livedMonths = age * 12;
        int livedDays = livedMonths * 30;
        
        System.out.println("\n> Meses: " + livedMonths);
        System.out.println("> Dias: " + livedDays);
    }
}