package me.andredezzy.exercisesrunner.exercises.old.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe o valor de 'A': 2
    Informe o valor de 'B': 3
    Informe o valor de 'C': 4
    Informe o valor de 'D': 5

    Adições:
    > A + B: 5
    > A + C: 6
    > A + D: 7
    > B + C: 7
    > B + D: 7
    > C + D: 9

    Multiplicações:
    > A * B: 6
    > A * C: 8
    > A * D: 10
    > B * C: 12
    > B * D: 12
    > C * D: 20
*/
public class Seventeen implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor de 'A': ");
        int a = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'B': ");
        int b = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'C': ");
        int c = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'D': ");
        int d = Application.ASKER.askForInt();

        System.out.println("\nAdições:");
        System.out.println("> A + B: " + (a + b));
        System.out.println("> A + C: " + (a + c));
        System.out.println("> A + D: " + (a + d));
        System.out.println("> B + C: " + (b + c));
        System.out.println("> B + D: " + (b + c));
        System.out.println("> C + D: " + (c + d));

        System.out.println("\nMultiplicações:");
        System.out.println("> A * B: " + (a * b));
        System.out.println("> A * C: " + (a * c));
        System.out.println("> A * D: " + (a * d));
        System.out.println("> B * C: " + (b * c));
        System.out.println("> B * D: " + (b * c));
        System.out.println("> C * D: " + (c * d));
    }
}
