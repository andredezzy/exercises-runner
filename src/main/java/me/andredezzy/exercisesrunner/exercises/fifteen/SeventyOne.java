package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class SeventyOne implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o nome da 1ª pessoa: ");
        String firstPersonName = Application.ASKER.askForText();

        System.out.print(String.format("Informe a altura da 1ª pessoa (%s): ", firstPersonName));
        double firstPersonHeight = Application.ASKER.askForDouble();

        System.out.print(String.format("Informe o peso da 1ª pessoa (%s): ", firstPersonName));
        double firstPersonWeight = Application.ASKER.askForDouble();


        System.out.print("\nInforme o nome da 2ª pessoa: ");
        String secondPersonName = Application.ASKER.askForText();

        System.out.print(String.format("Informe a altura da 2ª pessoa (%s): ", secondPersonName));
        double secondPersonHeight = Application.ASKER.askForDouble();

        System.out.print(String.format("Informe o peso da 2ª pessoa (%s): ", secondPersonName));
        double secondPersonWeight = Application.ASKER.askForDouble();


        String highestPerson = (firstPersonHeight > secondPersonHeight) ? firstPersonName : secondPersonName;
        String weightestPerson = (firstPersonWeight > secondPersonWeight) ? firstPersonName : secondPersonName;

        System.out.println("\n> Pessoa mais alta: " + highestPerson);
        System.out.println("> Pessoa mais pesada: " + weightestPerson);
    }
}
