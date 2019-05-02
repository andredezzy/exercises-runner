package me.andredezzy.exercisesrunner.exercises.three;

import me.andredezzy.exercisesrunner.exercises.Exercise;

import java.util.Scanner;

/*
        Informe o valor de 'A': 2
        Informe o valor de 'B': 2
        Informe o valor de 'C': 2

        a)
        A área do trapézio é: ((2.0 + 2.0) / 2) * 2.0
        > 4.0

        b)
        A área do quadrado é: 2.0²
        > 4.0

        c)
        A área da superfície do cubo é: 6 * 2.0²
        > 24.0
*/
public class One implements Exercise {

    public void run(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de 'A': ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor de 'B': ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor de 'C': ");
        double c = scanner.nextDouble();

        System.out.println("\na)");
        System.out.println(String.format("A área do trapézio é: ((%s + %s) / 2) * %s", a, b, c));
        System.out.println("> " + ((a + b) / 2) * c);

        System.out.println("\nb)");
        System.out.println(String.format("A área do quadrado é: %s²", b));
        System.out.println("> " + Math.pow(b, 2));

        System.out.println("\nc)");
        System.out.println(String.format("A área da superfície do cubo é: 6 * %s²", c));
        System.out.println("> " + (6 * Math.pow(b, 2)));
    }
}
