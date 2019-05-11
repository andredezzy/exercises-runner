/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex56;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv15ex56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner (System.in);
         //Variable
         int a, b, c;
         //comands
         System.out.println("Digite três números: ");
         a = input.nextInt();
         b = input.nextInt();
         c = input.nextInt();
         
         if ((a > b) && (a > c)){
        System.out.println(+ a + " Maior");}
         if ((b > c) && (b > a)){
             System.out.println(+ b + " Maior");}
         if ((c > a) && (c > b)){
             System.out.println(+ c + " Maior");}
         
    }
                 
                
    }
    

