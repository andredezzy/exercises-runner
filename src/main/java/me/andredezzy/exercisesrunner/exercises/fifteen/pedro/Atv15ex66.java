/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex66;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv15ex66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SCannus
        Scanner input = new Scanner (System.in);
        // varia
        int a, b;
        //Cap
        System.out.println("Digite dois números: ");
        a = input.nextInt();
        b = input.nextInt();
        if (a > b){
            System.out.println(+ a + " É maior que " + b);
            if (b > a){
                System.out.println(+ b + " É maior que " + a );
            }
        }
    }
    
}
