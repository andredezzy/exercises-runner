package me.andredezzy.exercisesrunner.exercises.sixteen;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

/* @Challenge
 *
 * Ordem hierárquica de tamanho:
 * > A - B - C
 **/
public class Five implements Exercise {

    public void run(String[] args) {
        int a, b, c;

        System.out.print("Informe o valor de 'A': ");
        a = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'B': ");
        b = Application.ASKER.askForInt();

        System.out.print("Informe o valor de 'C': ");
        c = Application.ASKER.askForInt();


        System.out.println("\nEscolha uma opção:");
        System.out.println("  [1] Crescente");
        System.out.println("  [2] Decrescente");
        System.out.println("  [3] Maior valor no meio");
        System.out.print("-> ");
        int optionIndex = Application.ASKER.askForInt();

        int backupN;

        if (a < b) {
            backupN = a;
            a = b;
            b = backupN;
        } else if (a < b) {
            backupN = a;
            a = b;
            b = backupN;
        } else if (b < c) {
            backupN = b;
            b = c;
            c = backupN;
        }

        String selectedOption;
        String orderedValues = "||";

        switch (optionIndex) {
            case 1:
                // C B A
                selectedOption = "Crescente";
                orderedValues = c + " - " + b + " - " + a;
                break;
            case 2:
                // A B C
                selectedOption = "Decrescente";
                orderedValues = a + " - " + b + " - " + c;
                break;
            case 3:
                // B A C
                selectedOption = "Maior valor no meio";
                orderedValues = b + " - " + a + " - " + c;
                break;
            default:
                selectedOption = "Inválida";
                break;
        }

        System.out.println("\n> Opção selecionada: " + selectedOption);
        System.out.println("> Valores: " + orderedValues);
    }
}
