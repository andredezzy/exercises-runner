/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex20;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //////
        Scanner input = new Scanner (System.in);
        int a, b , quadrado;
        double result;
        //ComandsCapitan
        System.out.println("Digite dois números: ");
        a = input.nextInt();
        b = input.nextInt();
        quadrado = (a + b);
        result = Math.pow(quadrado, 2);
        System.out.println("O resultado é: " + result);
        
    }
    
}
