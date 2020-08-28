package me.andredezzy.exercisesrunner.exercises.old.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredNine implements Exercise {

    public void run(String[] args) {
        int lastNumber = 0;

        int pairAmount = 0;
        int oddAmount = 0;

        while (lastNumber != 9999) {
            String numberString = JOptionPane.showInputDialog("Informe um número (9999 para parar): ");
            lastNumber = Integer.valueOf(numberString);

            if (lastNumber != 9999) {
                if ((lastNumber % 2) == 0) {
                    pairAmount++;
                } else {
                    oddAmount++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de números: \n\n"
                + "- Pares: " + pairAmount + "\n"
                + "- Ímpares: " + oddAmount);
    }
}
