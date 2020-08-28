package me.andredezzy.exercisesrunner.exercises.old.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredSeventeen implements Exercise {

    public void run(String[] args) {
        int number = Integer.valueOf(JOptionPane.showInputDialog("Informe um número: "));

        // E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
        int result = 1 + 1 / this.getFactorialOf(1) + 1 / this.getFactorialOf(2) + 1 / this.getFactorialOf(3) + 1 / this.getFactorialOf(number);

        JOptionPane.showMessageDialog(null, "Resultado: " + result);
    }

    private int getFactorialOf(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
