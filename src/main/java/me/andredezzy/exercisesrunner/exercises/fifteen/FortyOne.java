package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FortyOne implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor do salário mínimo: ");
        double minSalary = Application.ASKER.askForDouble();

        System.out.print("Informe a quantidade de carros vendidos: ");
        int soldCars = Application.ASKER.askForNumber();

        double comissionBySoldCars = soldCars * 50D;
        double comissionBySoldCarsPercentage = comissionBySoldCars * 0.05;
        
        double fixSalary = minSalary * 2;
        
        System.out.println("\n> Salário fixo: R$" + fixSalary);
        System.out.println("> Comissão por carro vendido: R$" + comissionBySoldCars);     
        System.out.println("> Porcentagem sobre o valor das vendas: R$" + comissionBySoldCarsPercentage);  
        
        double finalSalary = fixSalary + comissionBySoldCars + comissionBySoldCarsPercentage;
        
        System.out.println("\n> Salário líquido: R$" + comissionBySoldCarsPercentage);
    }
}
