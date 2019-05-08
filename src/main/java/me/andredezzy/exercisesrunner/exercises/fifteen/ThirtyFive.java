package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.utils.Formatter;

public class ThirtyFive implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o nome do candidato: ");
        String name = Application.ASKER.askForText();

        System.out.print("Informe a sua nota em Português: ");
        double portugueseGrade = Application.ASKER.askForDouble();

        System.out.print("Informe a sua nota em Matemática: ");
        double mathGrade = Application.ASKER.askForDouble();

        System.out.print("Informe a sua nota em Conhecimentos Gerais: ");
        double generalKnowledgeGrade = Application.ASKER.askForDouble();

        double testsAverage = (portugueseGrade + mathGrade + generalKnowledgeGrade) / 3;

        System.out.println("\n> Candidato: " + testsAverage);

        System.out.println("\n  Português: " + portugueseGrade);
        System.out.println("  Matemática: " + mathGrade);
        System.out.println("  Conhecimentos Gerais: " + generalKnowledgeGrade);

        System.out.println("\n> Média: " + Formatter.trim(testsAverage, 2));

        boolean approved = false;

        if (testsAverage > 7 && (portugueseGrade >= 5 && mathGrade >= 5 && generalKnowledgeGrade >= 5)) {
            approved = true;
        }

        System.out.println("-> Aprovado? " + (approved ? "SIMMM :D" : "... não :("));
    }
}
