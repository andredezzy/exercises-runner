package me.andredezzy.exercisesrunner.exercises.old.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe um código de 5 (cinco) algarismos: 11111

    A: 1
    B: 1
    C: 1
    D: 1
    E: 1

    S: (6 * 1) + (5 * 1) + (4 * 1) + (3 * 1) + (2 * 1)
    > S: 20

    Digito V: 20 % 7
    > 6
*/
public class TwentySeven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um código de 5 (cinco) algarismos: ");
        int code = Application.ASKER.askForInt();

        while (String.valueOf(code).length() != 5) {
            System.out.println("[ERRO] O código não possui 5 (cinco) algarismos!");
            System.out.print("Informe um código de 5 (cinco) algarismos: ");
            code = Application.ASKER.askForInt();
        }

        int a = code / 10000;
        int b = (code / 1000) % 10;
        int c = (code / 100) % 10;
        int d = (code / 10) % 10;
        int e = code % 10;

        System.out.println("\nA: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("E: " + e);

        int s = (6 * a) + (5 * b) + (4 * c) + (3 * d) + (2 * e);

        System.out.println(String.format("%nS: (6 * %s) + (5 * %s) + (4 * %s) + (3 * %s) + (2 * %s)", a, b, c, d, e));
        System.out.println("> S: " + s);

        int digitV = s % 7;

        System.out.println(String.format("%nDigito V: %s %s 7", s, "%"));
        System.out.println("> " + digitV);
    }
}
