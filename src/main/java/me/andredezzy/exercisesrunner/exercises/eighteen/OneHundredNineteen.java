package me.andredezzy.exercisesrunner.exercises.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredNineteen implements Exercise {

    public void run(String[] args) {
        int n = Integer.valueOf(JOptionPane.showInputDialog("Informe o número de termos da progressão aritmética:"));
        int a1 = Integer.valueOf(JOptionPane.showInputDialog("Informe o primeiro termo da progressão aritmética:"));
        int r = Integer.valueOf(JOptionPane.showInputDialog("Informe a razão da progressão aritmética:"));

        int elementsSum = 0;

        for (int i = a1; i <= n; i += r) {
            // n = a1 + (n - 1) * r
            int result = a1 + (i - 1) * r;

            JOptionPane.showMessageDialog(null, result);

            elementsSum += result;
        }

        JOptionPane.showMessageDialog(null, "A soma dos elemetos é: " + elementsSum);
    }
}
