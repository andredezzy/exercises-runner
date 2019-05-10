package me.andredezzy.exercisesrunner.exercises.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe o valor de 'A': 1
    Informe o valor de 'B': 2

    > B: 2
    > A: 1
*/
public class TwentyThree implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor de 'A': ");
        int a = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'B': ");
        int b = Application.ASKER.askForInt();
        
        System.out.println("\n> B: " + b);
        System.out.println("> A: " + a);
    }
}
