/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex24;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////////Entrada
        Scanner input = new Scanner (System.in);
        //ComandsCapitan
        double km, ms;
        System.out.println("Digite aqui a velocidade em KM/h: ");
        km = input.nextDouble();
        ms = km / 3.6;
        System.out.println("A velocidade me metros por segundo é: " + ms );
        
        
    }
    
}
