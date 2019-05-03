package me.andredezzy.exercisesrunner.exercises.fourteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe o raio da circunferência: 2

    A área da circunferência é: PI * 2.0^2
    > 12.566370614359172 
*/
public class Seven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o raio da circunferência: ");
        double radius = Application.ASKER.askForDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println(String.format("%nA área da circunferência é: PI * %s^2", radius));
        System.out.println("> " + area);
    }
}
