/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex46;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        //Variables
        double totaldiaria, dia;
        String name;
        //Cap
        System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Digite quantos dias deseja ficar: ");
        dia = input.nextDouble();

        if (dia > 15) {
            totaldiaria = 60 * 5.50;
        }
        if (dia < 15) {
            totaldiaria = 60 * 8.0;
        }
        if (dia == 15) {
            totaldiaria = 60 * 6.0;
            System.out.println("Total a pagar: " + totaldiaria);
            System.out.println("Nome: " + name);
        }

    }

}
