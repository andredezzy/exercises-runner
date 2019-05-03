package me.andredezzy.exercisesrunner.exercises.fourteen;

import java.util.Scanner;
import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/*
    Informe as horas trabalhadas no mês: 120
    Informe o valor para cada hora trabalhada: 20
    Informe o percentual de desconto: 5%

    > Horas trabalhadas: 120.0

    > Salário bruto: 2400.0
    > Desconto: 120.0
    >> Salário líquido: 2280.0
*/
public class Eleven implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe as horas trabalhadas no mês: ");
        double monthWorkedHours = Application.ASKER.askForDouble();
        
        System.out.print("Informe o valor para cada hora trabalhada: ");
        double workedHourPrice = Application.ASKER.askForDouble();
        
        System.out.print("Informe o percentual de desconto: ");
        double discountPercentage = Application.ASKER.askForPercentage();
        
        double grossSalary = monthWorkedHours * workedHourPrice;
        double totalDiscount = (discountPercentage / 100) * grossSalary;
        
        double liquidSalary = grossSalary - totalDiscount;
        
        System.out.println("\n> Horas trabalhadas: " + monthWorkedHours);
        System.out.println("\n> Salário bruto: " + grossSalary);
        System.out.println("> Desconto: " + totalDiscount);
        System.out.println(">> Salário líquido: " + liquidSalary);
    }
}
