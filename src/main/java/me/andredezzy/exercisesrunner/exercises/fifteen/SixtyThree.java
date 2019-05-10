package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class SixtyThree implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o código do produto: ");
        String productCode = Application.ASKER.askForString();

        System.out.print("Informe a quantidade: ");
        int amount = Application.ASKER.askForInt();

        double price = -404;

        if (productCode.equalsIgnoreCase("1001")) {
            price = 5.32D * amount;
        } else if (productCode.equalsIgnoreCase("1324")) {
            price = 6.45D * amount;
        } else if (productCode.equalsIgnoreCase("6548")) {
            price = 2.37D * amount;
        } else if (productCode.equalsIgnoreCase("0987")) {
            price = 5.32D * amount;
        } else if (productCode.equalsIgnoreCase("7623")) {
            price = 6.45D * amount;
        }

        System.out.println("\n> Preço total: R$" + price);
    }
}
