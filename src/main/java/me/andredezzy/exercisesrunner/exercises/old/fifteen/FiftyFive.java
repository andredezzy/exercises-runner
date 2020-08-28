package me.andredezzy.exercisesrunner.exercises.old.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.utils.Formatter;

public class FiftyFive implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe um valor para prova 'A': ");
        double a = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para prova 'B': ");
        double b = Application.ASKER.askForDouble();

        System.out.print("Informe um valor para prova 'C': ");
        double c = Application.ASKER.askForDouble();

        double abcAverage = (a + b + c) / 3;

        System.out.println("\n> Média: " + Formatter.trim(abcAverage, 2));

        String resultMessage = "reprovado... D:";

        if (abcAverage >= 7) {
            resultMessage = "APROVADO! :D";
        } else if (abcAverage >= 4) {
            resultMessage = "em prova final :(";
        }

        System.out.println("-> Resultado: " + resultMessage);
    }
}
