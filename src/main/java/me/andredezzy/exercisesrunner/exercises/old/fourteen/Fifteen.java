package me.andredezzy.exercisesrunner.exercises.old.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

import java.text.DecimalFormat;

/*
    Informe o tempo gasto na viagem (horas): 2
    Informe a velocidade média durante toda a viagem: 50

    > Distância percorrida: 100.0
    > Quantidade de combustível gasta (12Km por litro): 8,33
 */
public class Fifteen implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o tempo gasto na viagem (horas): ");
        double spentTime = Application.ASKER.askForDouble();

        System.out.print("Informe a velocidade média durante toda a viagem: ");
        int averageSpeed = Application.ASKER.askForInt();

        double distance = spentTime * averageSpeed;
        double spentFuelAmount = distance / 12;

        DecimalFormat roundDecimalFormat = new DecimalFormat("#.00");

        System.out.println("\n> Distância percorrida: " + distance);
        System.out.println("> Quantidade de combustível gasta (12Km por litro): "
                + roundDecimalFormat.format(spentFuelAmount));
    }
}
