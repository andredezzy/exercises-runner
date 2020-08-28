package me.andredezzy.exercisesrunner.exercises.old.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredTwentyOne implements Exercise {

    public void run(String[] args) {
        int number = Integer.valueOf(JOptionPane.showInputDialog("Informe um número:"));

        int lastSquare = 2;

        for (int i = 0; lastSquare <= number; i++) {
            int square = i * i;

            if (square <= number) {
                lastSquare = square;
            } else {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior quadrado menor ou igual ao número informado é: " + lastSquare);
    }
}
