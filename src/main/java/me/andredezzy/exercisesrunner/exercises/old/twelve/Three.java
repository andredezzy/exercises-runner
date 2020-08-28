package me.andredezzy.exercisesrunner.exercises.old.twelve;

import me.andredezzy.exercisesrunner.exercises.Exercise;

import java.util.Scanner;

/*
    Informe o nome do funcionário: Teste
    Informe as horas trabalhadas por Teste: 2
    Informe quanto Teste recebe por hora: 2
    Informe quantos filhos Teste possui: 2

    > Teste possui um salário líquido de: 4.24
*/
public class Three implements Exercise {

    public void run(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String employeeName = scanner.nextLine();

        System.out.print(String.format("Informe as horas trabalhadas por %s: ", employeeName));
        double workedHours = scanner.nextDouble();

        System.out.print(String.format("Informe quanto %s recebe por hora: ", employeeName));
        double salaryPerHour = scanner.nextDouble();

        System.out.print(String.format("Informe quantos filhos %s possui: ", employeeName));
        double childrenCount = scanner.nextDouble();

        double grossSalary = workedHours * salaryPerHour;
        double liquidSalary = grossSalary + (grossSalary * (childrenCount * 0.03));

        System.out.println(String.format("%n> %s possui um salário líquido de: %s", employeeName, liquidSalary));
    }
}
