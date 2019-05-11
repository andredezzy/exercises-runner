/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex50;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        //Variables
        int n;
        //CapComands
        System.out.println("Digite sua nota: ");
        n = input.nextInt();
        {
            if ((n >= 0) && (n <= 49))
            System.out.println("insuficiente " + n);
        }

        {
            if ((n >= 50) && (n <= 64))
            System.out.println("regular " + n);
        }

        {
            if ((n >= 65) && (n <= 80))
            System.out.println("Bom " + n);
        }

        {
            if (n >= 81) {
                System.out.println("Ótimo" + n);
            }
        }

    }

}
