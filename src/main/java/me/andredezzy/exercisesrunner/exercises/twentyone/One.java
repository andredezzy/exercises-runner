package me.andredezzy.exercisesrunner.exercises.twentyone;

import java.util.Arrays;
import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class One implements Exercise {

    public void run(String[] args) {
        String[] values = new String[12];

        for (int i = 0; i < 12; i++) {
            // String value = JOptionPane.showInputDialog("Informe um valor para a " + (i + 1) + "ª posição: ");

            // values[i] = value;
            values[i] = String.valueOf(i);
        }

        String indexToSearch = "";
        while (!indexToSearch.equalsIgnoreCase("parar") || !indexToSearch.equalsIgnoreCase("fim")) {
            indexToSearch = JOptionPane.showInputDialog("Informe o índice para retornarmos o valor do mesmo\ndentro do vetor (digite parar para cancelar): ");

            int index = Integer.valueOf(indexToSearch);

            String value = values[index];

            JOptionPane.showMessageDialog(null, "O valor contido no índice " + index + ", é: " + value);
        }

        System.out.println("\nVetor de valores: " + Arrays.toString(values));
    }
}
