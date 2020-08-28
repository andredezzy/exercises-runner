/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex28;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /////entrada
        Scanner input = new Scanner (System.in);
        //ComandsCapitain
        
        int n;
        System.out.println("Digite aqui três números: ");
        n = input.nextInt();       
        System.out.println(n % 10);
        System.out.println(n / 10 % 10);
        System.out.println(n / 100);
        System.out.println("O resultado é:" + (n % 10) + (n/10 % 10) + (n / 100));
         
        
        
    }
    
}
