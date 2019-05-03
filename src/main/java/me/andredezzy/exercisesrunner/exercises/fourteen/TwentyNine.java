package me.andredezzy.exercisesrunner.exercises.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class TwentyNine implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe a data no formato DDMMAA: ");
        int dateCode = Application.ASKER.askForNumber();

        while (String.valueOf(dateCode).length() != 6) {
            System.out.println("[ERRO] A data deve conter 6 (cinco) algarismos! Formato: DDMMAA");
            System.out.print("Informe a data no formato DDMMAA: ");
            dateCode = Application.ASKER.askForNumber();
        }

        int d1 = dateCode / 100000;
        int d2 = (dateCode / 10000) % 10;

        int m1 = (dateCode / 1000) % 10;
        int m2 = (dateCode % 1000) / 100;

        int a1 = (dateCode % 100) / 10;
        int a2 = dateCode % 10;

        System.out.println("\nD¹: " + d1);
        System.out.println("D²: " + d2);

        System.out.println("\nM¹: " + m1);
        System.out.println("M²: " + m2);

        System.out.println("\nA¹: " + a1);
        System.out.println("A²: " + a2);

        System.out.println(String.format("%n> AAMMDD: %s%s%s%s%s%s", a2, a1, m2, m1, d2, d1));
    }
}
