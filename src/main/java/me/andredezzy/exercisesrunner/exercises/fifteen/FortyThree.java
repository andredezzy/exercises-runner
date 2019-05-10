package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FortyThree implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o nome do funcionário: ");
        String employeeName = Application.ASKER.askForText();

        System.out.print("Informe o seu salário: ");
        double salary = Application.ASKER.askForDouble();

        System.out.print("Informe a sua categoria (alguma letra do alfabeto): ");
        char category = Application.ASKER.askForString().toUpperCase().charAt(0);

        double adjustedSalary = salary;

        if (category == 'A' || category == 'C' || category == 'F' || category == 'H') {
            adjustedSalary *= 1.1;
        } else if (category == 'B' || category == 'D' || category == 'E' || category == 'I' || category == 'J' || category == 'T') {
            adjustedSalary *= 1.15;
        } else if (category == 'K' || category == 'R') {
            adjustedSalary *= 1.25;
        } else if (category == 'L' || category == 'M' || category == 'N' || category == 'O' || category == 'P' || category == 'Q' || category == 'S') {
            adjustedSalary *= 1.35;
        } else if (category == 'U' || category == 'V' || category == 'X' || category == 'Y' || category == 'W' || category == 'Z') {
            adjustedSalary *= 1.50;
        }

        System.out.println("\n> Salário reajustado: R$" + adjustedSalary);
    }
}
