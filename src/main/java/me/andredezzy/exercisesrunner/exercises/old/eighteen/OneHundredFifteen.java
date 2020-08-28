package me.andredezzy.exercisesrunner.exercises.old.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredFifteen implements Exercise {

    public void run(String[] args) {
        String lastName = "";

        int count = 0;
        double totalSalary = 0;

        double smallestSalary = Integer.MAX_VALUE;
        double biggestSalary = 0;
        double salaryAverage;

        while (!lastName.equalsIgnoreCase("fim")) {
            lastName = JOptionPane.showInputDialog("Informe um nome ('fim' para parar): ");

            if (!lastName.equalsIgnoreCase("fim")) {
                double salary = Double.valueOf(JOptionPane.showInputDialog("Informe o salário de " + lastName));

                if (salary < smallestSalary) {
                    smallestSalary = salary;
                }
                if (salary > biggestSalary) {
                    biggestSalary = salary;
                }

                totalSalary += salary;
                count++;
            }
        }

        salaryAverage = totalSalary / count;

        JOptionPane.showMessageDialog(null, "Salário:"
                + "\n\n- Média: " + salaryAverage
                + "\n- Menor: " + smallestSalary
                + "\n- Maior: " + biggestSalary);
    }
}
