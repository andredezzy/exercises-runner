package me.andredezzy.exercisesrunner.exercises.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredTwentyFive implements Exercise {

    public void run(String[] args) {
        int houseFloorsAmount = Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de andares presente no prédio: "));

        for (int i = 0; i <= houseFloorsAmount; i++) {
        }
    }
}
