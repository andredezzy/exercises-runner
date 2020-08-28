package me.andredezzy.exercisesrunner.exercises.old.twentyone;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class Four implements Exercise {

    public void run(String[] args) {
        int[] values = new int[20];

        for (int i = 0; i < 20; i++) {
            values[i] = i;
        }

        String valueToSearchString = JOptionPane.showInputDialog("Informe um valor para procurarmos dentro do vetor e\nretornarmos o índice em que o mesmo se encontra:");
        int valueToSearch = Integer.valueOf(valueToSearchString);

        int indexFound = -1;

        for (int i = 0; i < 20; i++) {
            int value = values[i];

            if (value == valueToSearch) {
                indexFound = i;
            }
        }

        if (indexFound != -1) {
            JOptionPane.showMessageDialog(null, "O valor (" + valueToSearchString + ") foi encontrado no índice " + indexFound + " do vetor.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor (" + valueToSearchString + ") não foi encontrado dentro do vetor.");
        }
    }
}
