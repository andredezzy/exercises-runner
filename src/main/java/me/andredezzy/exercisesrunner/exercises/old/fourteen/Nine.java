package me.andredezzy.exercisesrunner.exercises.old.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*

*/
public class Nine implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o seu nome: ");
        String firstName = Application.ASKER.askForText();
        
        System.out.print("Informe o seu sobrenome: ");
        String lastName = Application.ASKER.askForText();
        
        System.out.println(String.format("%n> Nome completo: %s %s", firstName, lastName));
    }
}
