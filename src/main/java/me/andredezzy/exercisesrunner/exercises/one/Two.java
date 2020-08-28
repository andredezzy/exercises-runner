package me.andredezzy.exercisesrunner.exercises.one;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Two implements Exercise {
    public void run(String[] args) {
        System.out.print("Informe o seu salário: ");
        double salary = Application.ASKER.askForDouble();

        double minimumSalaryCount = salary / 1024;

        System.out.printf("Você recebe %.2f salários mínimos.%n", minimumSalaryCount);
    }
}
