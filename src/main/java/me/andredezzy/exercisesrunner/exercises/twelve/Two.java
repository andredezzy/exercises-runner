package me.andredezzy.exercisesrunner.exercises.twelve;

import me.andredezzy.exercisesrunner.exercises.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Informe o raio da caixa d'água cilíndrica: 2
    Informe a altura da caixa d'água cilíndrica: 2

    O volume da caixa d'água cilíndrica é: PI * 2.0^2 * 2.0
    > 25.132741228718345
    > 25,13
*/
public class Two implements Exercise {

    public void run(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da caixa d'água cilíndrica: ");
        double radius = scanner.nextDouble();

        System.out.print("Informe a altura da caixa d'água cilíndrica: ");
        double height = scanner.nextDouble();

        double volumeResult = Math.PI * Math.pow(radius, 2) * height;
        DecimalFormat roundDecimalFormat = new DecimalFormat("#.00");

        System.out.printf("\nO volume da caixa d'água cilíndrica é: PI * %s^2 * %s%n", radius, height);
        System.out.println("> " + volumeResult);
        System.out.println("> " + roundDecimalFormat.format(volumeResult));
    }
}
