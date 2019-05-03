package me.andredezzy.exercisesrunner.exercises.fourteen;

import java.text.DecimalFormat;
import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe a temperatura (Fº): 72

    Fahrenheit -> Celsius: (72.0 - 32) * (5.0 / 9.0)
    > 22,22 ºC
 */
public class Thirteen implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe a temperatura (Fº): ");
        double fahrenheit = Application.ASKER.askForDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        DecimalFormat roundDecimalFormat = new DecimalFormat("#.00");

        System.out.println(String.format("%nFahrenheit -> Celsius: (%s - 32) * (5.0 / 9.0)", fahrenheit));
        System.out.println("> " + roundDecimalFormat.format(celsius) + " ºC");
    }
}
