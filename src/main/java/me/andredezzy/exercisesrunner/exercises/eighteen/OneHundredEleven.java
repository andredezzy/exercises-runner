package me.andredezzy.exercisesrunner.exercises.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.utils.Formatter;

public class OneHundredEleven implements Exercise {

    public void run(String[] args) {
        int lastNumber = 0;

        int count = 0;

        int lessThanTenTimes = 0;
        int betweenTenAndFifteenTimes = 0;
        int moreThanFifteenTimes = 0;

        double lessThanTenTimesPercentage = 0;
        double betweenTenAndFifteenTimesPercentage = 0;
        double moreThanFifteenTimesPercentage = 0;

        while (lastNumber != 9999) {
            String numberString = JOptionPane.showInputDialog("Informe a quantidade de vezes\nna qual você foi ao "
                    + "restaurante\nda universidade no último  mês\n(9999 para parar):\n\n");
            lastNumber = Integer.valueOf(numberString);

            if (lastNumber != 9999) {
                if (lastNumber < 10) {
                    lessThanTenTimes++;
                } else if (lastNumber >= 10 && lastNumber <= 15) {
                    betweenTenAndFifteenTimes++;
                } else if (lastNumber > 15) {
                    moreThanFifteenTimes++;
                }

                count++;
            }
        }

        lessThanTenTimesPercentage = (100D / count) * Double.valueOf(lessThanTenTimes);
        betweenTenAndFifteenTimesPercentage = (100D / count) * Double.valueOf(betweenTenAndFifteenTimes);
        moreThanFifteenTimesPercentage = (100D / count) * Double.valueOf(moreThanFifteenTimes);

        JOptionPane.showMessageDialog(null, "Quantidade de alunos que utilizaram o restaurante: " + count + "\n\n"
                + "- Menos de 10 vezes: " + lessThanTenTimes + " (" + Formatter.trim(lessThanTenTimesPercentage, 2) + "%)"
                + "\n- Entre 10 e 15 vezes: " + betweenTenAndFifteenTimes + " (" + Formatter.trim(betweenTenAndFifteenTimesPercentage, 2) + "%)"
                + "\n- Acima de 15 vezes: " + moreThanFifteenTimes + " (" + Formatter.trim(moreThanFifteenTimesPercentage, 2) + "%)");
    }
}
