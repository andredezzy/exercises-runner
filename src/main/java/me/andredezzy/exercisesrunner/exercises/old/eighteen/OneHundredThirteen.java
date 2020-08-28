package me.andredezzy.exercisesrunner.exercises.old.eighteen;

import javax.swing.JOptionPane;
import me.andredezzy.exercisesrunner.exercises.Exercise;

public class OneHundredThirteen implements Exercise {

    public void run(String[] args) {
        String firstPersonName = JOptionPane.showInputDialog("Informe o nome da 1ª pessoa: ");
        double firstPersonHeight = Double.valueOf(JOptionPane.showInputDialog("Informe a altura da 1ª pessoa: "));
        double firstPersonWeight = Double.valueOf(JOptionPane.showInputDialog("Informe o peso da 1ª pessoa: "));

        String secondPersonName = JOptionPane.showInputDialog("Informe o nome da 1ª pessoa: ");
        double secondPersonHeight = Double.valueOf(JOptionPane.showInputDialog("Informe a altura da 1ª pessoa: "));
        double secondPersonWeight = Double.valueOf(JOptionPane.showInputDialog("Informe o peso da 1ª pessoa: "));

        String highestPersonName = firstPersonHeight > secondPersonHeight ? firstPersonName : secondPersonName;
        String weighestPersonName = firstPersonWeight > secondPersonWeight ? firstPersonName : secondPersonName;

        JOptionPane.showMessageDialog(null, "A pessoa (" + firstPersonName + ", " + secondPersonName + "):"
                + "\n\n- Mais alta é: " + highestPersonName
                + "\n- Mais pesada é: " + weighestPersonName);
    }
}
