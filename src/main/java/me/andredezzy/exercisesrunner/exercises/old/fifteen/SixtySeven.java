package me.andredezzy.exercisesrunner.exercises.old.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class SixtySeven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o salário atual: ");
        double currentSalary = Application.ASKER.askForDouble();

        double adjustedSalary = currentSalary * 0.15;

        if (currentSalary >= 1500 && currentSalary < 1750) {
            adjustedSalary = currentSalary * 0.12;
        } else if (currentSalary >= 1750 && currentSalary < 2000) {
            adjustedSalary = currentSalary * 0.1;
        } else if (currentSalary >= 2000 && currentSalary < 3000) {
            adjustedSalary = currentSalary * 0.07;
        } else if (currentSalary > 3000) {
            adjustedSalary = currentSalary * 0.05;
        }

        double totalSalary = currentSalary + adjustedSalary;

        System.out.println("\n> Aumento salarial: R$" + adjustedSalary);
        System.out.println("> Salário total: R$" + totalSalary);
    }
}
