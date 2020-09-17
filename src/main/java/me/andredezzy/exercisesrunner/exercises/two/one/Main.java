package me.andredezzy.exercisesrunner.exercises.two.one;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Main implements Exercise {

    @Override
    public void run(String[] args) {
        System.out.print("Informe o dia: ");
        int day = Application.ASKER.askForInt();

        System.out.print("Informe o mês: ");
        int month = Application.ASKER.askForInt();

        System.out.print("Informe o ano: ");
        int year = Application.ASKER.askForInt();

        Date date = new Date(year, month, day);

        System.out.printf("%nData formatada: %s%n", date.format());
    }
}
