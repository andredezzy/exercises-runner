package me.andredezzy.exercisesrunner.exercises.old.twelve;

import me.andredezzy.exercisesrunner.exercises.Exercise;

import java.util.Scanner;

/*
    Informe o nome do piloto: Teste
    Informe a distância percorrida (em km) por Teste: 100
    Informe quantas horas Teste demorou para percorrer 100.0km: 2

    > A velocidade média de Teste foi 50.0 km/h.
*/
public class Five implements Exercise {

    public void run(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do piloto: ");
        String pilotName = scanner.nextLine();

        System.out.print(String.format("Informe a distância percorrida (em km) por %s: ", pilotName));
        double traveledDistance = scanner.nextDouble();

        System.out.print(String.format("Informe quantas horas %s demorou para percorrer %skm: ", pilotName, traveledDistance));
        double traveledHours = scanner.nextDouble();

        double averageSpeed = traveledDistance / traveledHours;

        System.out.println(String.format("%n> A velocidade média de %s foi %s km/h.", pilotName, averageSpeed));
    }
}
