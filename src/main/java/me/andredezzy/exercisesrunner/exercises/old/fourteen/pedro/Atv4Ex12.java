/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex12;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double C, F;
        System.out.println("Digite aqui a temperatura em Fahrenheit : ");
        F = input.nextInt ();
        C = (F - 32) * 5/9;
        System.out.println("A temperatura convertida para Graus Celsius é: " + C);
        
        
    }
    
}
