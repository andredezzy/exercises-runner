package me.andredezzy.exercisesrunner.exercises.one;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Four implements Exercise {
    public void run(String[] args) {
        System.out.print("Informe um valor: ");
        double value = Application.ASKER.askForDouble();

        System.out.print("Informe uma porcentagem de juros à ser acrescentada: ");
        double percentage = Application.ASKER.askForPercentage();

        double finalValue = value * percentage;

        System.out.printf("%nValor final: R$ %s.%n", finalValue);
    }
}
