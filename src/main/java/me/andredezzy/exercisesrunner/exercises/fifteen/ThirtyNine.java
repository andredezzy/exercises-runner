package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class ThirtyNine implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o valor da compra (não utilize casas decimais -> moedas): ");
        int price = Application.ASKER.askForInt();
        
        System.out.print("Informe a quantia em dinheiro dada ao caixa: ");
        int payAmount = Application.ASKER.askForInt();
        
        if (price > payAmount) {
            System.out.println("\n> Dinheiro insuficiente! Faltam R$" + (price - payAmount));
            
            return;
        }
        
        int returnAmount = payAmount - price;
        
        int oneHundredReturnAmount = returnAmount / 100;
        int tenReturnAmount = (returnAmount - oneHundredReturnAmount) / 10;
        int oneReturnAmount = returnAmount - (tenReturnAmount * 10);
        
        System.out.println("\n> Valor a ser retornado ao comprador (troco): " + returnAmount);
        System.out.println("\n  R$100: " + oneHundredReturnAmount);
        System.out.println("  R$10: " + tenReturnAmount);
        System.out.println("  R$1: " + oneReturnAmount);
    }
}