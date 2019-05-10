package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.utils.Formatter;

public class SixtyOne implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para prova 'A': ");
        double a = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para prova 'B': ");
        double b = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para prova 'C': ");
        double c = Application.ASKER.askForDouble();

        double abcAverage = -404;

        System.out.println("\nEscolha o tipo de média a ser calculada: ");
        System.out.println(" [1] Aritmética");
        System.out.println(" [2] Ponderada (pesos 3, 3, 4)");
        System.out.print("> ");
        int averageOptionIndex = Application.ASKER.askForInt();

        switch (averageOptionIndex) {
            case 1:
                abcAverage = (a + b + c) / 3;

                break;
            case 2:
                abcAverage = ((a * 3) + (b * 3) + (c * 4)) / (3 + 3 + 4);

                break;
        }

        System.out.println("\n> Média: " + Formatter.trim(abcAverage, 2));
    }
}
