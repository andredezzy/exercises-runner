/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex22;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /////////
        Scanner input = new Scanner (System.in);
        double Val1, Val2, average;
        
        ////ComandsCapitain
        System.out.println("Digite aqui dois números: ");
        Val1 = input.nextDouble();
        Val2 = input.nextDouble();
        average = (Val1 + Val2) / 2 ;
        System.out.println("A média dessas notas é: " + average);
        
    }
    
}
