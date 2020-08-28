/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex52;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        //Variables
        int n1, n2;
        //Cap
        System.out.println("Digite dois números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        if (n1 > n2) {
            System.out.println("" + n1 + " " + n2);
        } else {
            System.out.println("" + n2 + " " + n1);
        }

    }

}
