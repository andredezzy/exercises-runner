package me.andredezzy.exercisesrunner.exercises.old.sixteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Three implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe a nota do aluno: ");
        int grade = Application.ASKER.askForInt();

        char concept = 'A';

        if(grade < 3){
            concept = 'E';
        } else if(grade <= 5) {
            concept = 'D';
        } else if(grade <= 7) {
            concept = 'C';
        } else if(grade <= 9) {
            concept = 'B';
        }

        System.out.println("\n> O conceito é: " + concept);
    }
}
