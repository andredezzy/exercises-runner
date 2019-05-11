/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex68;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv15ex68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //sca
       Scanner input = new Scanner (System.in);
       //var
       double a;
       //cap
        System.out.println("Digite um número: ");
        a = input.nextDouble();
        if (a % 2 == 0 ){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");}
        
        }
               
    }

    
    

