/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex38;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        //CapComands
        int a, b, c;
        System.out.println("Digite A, depois B e em seguida C: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a + b == c) {
            System.out.println("Igual");

        }
        if (a + b > c) {
            System.out.println("Maior");

        }
        if (a + b < c) {
            System.out.println("Menor");
        }
    }

}
