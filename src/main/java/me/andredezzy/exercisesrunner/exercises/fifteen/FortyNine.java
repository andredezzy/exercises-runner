package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FortyNine implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o lado 'X' do triângulo: ");
        double x = Application.ASKER.askForDouble();

        System.out.print("Informe o lado 'Y' do triângulo: ");
        double y = Application.ASKER.askForDouble();

        System.out.print("Informe o lado 'Z' do triângulo: ");
        double z = Application.ASKER.askForDouble();

        String triangleType = "equilátero";

        if (x >= (y + z) || y >= (x + z) || z >= (x + y) || x == 0 || y == 0 || x == 0) {
            System.out.println("\n[ERRO] 'X', 'Y' e 'Z' não formam um triângulo!");
        } else {
            if (x == y && y == z) {
                triangleType = "equilátero";
            } else {
                if (x == y || y == z || x == z) {
                    triangleType = "isósceles";
                } else {
                    triangleType = "escaleno";
                }
            }

            System.out.println("\n> Os lados informados são equivalentes à um triângulo " + triangleType);
        }
    }
}
