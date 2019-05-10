package me.andredezzy.exercisesrunner.exercises.fifteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class FortyFive implements Exercise {

    public void run(String[] args) {
        System.out.print("Informe o número de sua conta bancaria: ");
        int bankAccountCode = Application.ASKER.askForInt();
        
        System.out.print("Informe o saldo contido na mesma: ");
        double balance = Application.ASKER.askForDouble();
        
        while (true) {
            System.out.println("\n  > Saldo atual: " + balance);
            
            System.out.println("\n  Escolha uma opção: ");
            System.out.println("   [1] Depositar");
            System.out.println("   [2] Retirar");
            System.out.println("   [3] Sair");
            
            System.out.print(">   ");
            int optionIndex = Application.ASKER.askForInt();
            
            System.out.println();
            switch (optionIndex){
                case 1:
                    System.out.print("[+] Informe a quantia a ser depositada: ");
                    balance += Application.ASKER.askForDouble();
                    
                    break;
                case 2:
                    System.out.print("[-] Informe a quantia a ser retirada: ");
                    balance -= Application.ASKER.askForDouble();
                    
                    break;
                case 3:
                    return;
                default:
                    System.out.println("[ERRO] Escolha uma opção válida!");
                    break;
            }
            
            System.out.print("\nPreciso ENTER para continuar...");
            Application.ASKER.askForText();
        }
    }
}