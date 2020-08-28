package me.andredezzy.exercisesrunner.exercises.old.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredSeven implements Exercise {

    public void run(String[] args) {
        int lastNumber = 0;
        int highestNumber = 0;

        while (lastNumber != 9999) {
            String numberString = JOptionPane.showInputDialog("Informe um número (9999 para parar): ");
            lastNumber = Integer.valueOf(numberString);

            if (lastNumber != 9999 && lastNumber > highestNumber) {
                highestNumber = lastNumber;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número dentre os que você digitou, é: " + highestNumber);
    }
}
