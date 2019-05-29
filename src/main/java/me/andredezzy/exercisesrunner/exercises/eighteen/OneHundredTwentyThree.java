package me.andredezzy.exercisesrunner.exercises.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredTwentyThree implements Exercise {

    public void run(String[] args) {
        int lastAge = 0;

        int highestAge = lastAge;
        int femaleBetweenEighteenAndThirtyFiveCount = 0;
        int greenEyeAndYellowHair = 0;

        while (lastAge >= 0) {
            lastAge = Integer.valueOf(JOptionPane.showInputDialog("Informe a idade:"));
            
            if (lastAge < 0) {
                break;
            }
            
            char sex = JOptionPane.showInputDialog("Informe o sexo:").toLowerCase().startsWith("m") ? 'M' : 'F';
            String eyesColor = JOptionPane.showInputDialog("Informe a cor dos olhos:");
            String hairColor = JOptionPane.showInputDialog("Informe a cor do cabelo:");

            if (lastAge > highestAge) {
                highestAge = lastAge;
            }
            if (sex == 'F' && (lastAge >= 18 && lastAge <= 35)) {
                femaleBetweenEighteenAndThirtyFiveCount++;
            }
            if (eyesColor.toLowerCase().startsWith("verde") && hairColor.toLowerCase().startsWith("louro")) {
                greenEyeAndYellowHair++;
            }
        }

        JOptionPane.showMessageDialog(null, "A maior idade dentre os demais é: " + highestAge
                + "\nMulheres/meninas entre 18 e 35 anos de idade: " + femaleBetweenEighteenAndThirtyFiveCount
                + "\nHabitantes com olhos verdes e cabelos louros: " + greenEyeAndYellowHair);
    }
}
