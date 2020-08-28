package me.andredezzy.exercisesrunner.exercises.old.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe o valor de 'A': 3
    Informe o valor de 'B': 2

    Quociente: 3 / 2
    > 1

    Resto: 3 % 2
    > 1
*/
public class TwentyFive implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor de 'A': ");
        int a = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'B': ");
        int b = Application.ASKER.askForInt();

        System.out.println(String.format("%nQuociente: %s / %s", a, b));
        System.out.println("> " + (a / b));

        System.out.println(String.format("%nResto: %s %s %s", a, "%", b));
        System.out.println("> " + (a % b));
    }
}
