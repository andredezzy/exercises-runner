/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.andredezzy.exercisesrunner.exercises.old.fifteen.pedro;

import java.util.Scanner;

/**
 * @author pedro
 */
public class Atv15ex34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        //CapitãoComandos
        int n1, n2, n3;
        System.out.println("Digite aqui três números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        if (n1 < n2) {
            System.out.println(n1);
        }
    }
}
