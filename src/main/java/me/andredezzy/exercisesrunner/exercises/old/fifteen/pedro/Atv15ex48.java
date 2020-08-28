/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv15ex48;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        //Variables
        int a , b , c;
        //CAp
        System.out.println("Digite três números: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if ((a < b) && (a < c)){
            System.out.println(a);
        } if ((b < a) && (b < c)){
            System.out.println(b);
        } if ((c < a ) && (c < b))
            System.out.println(c);}
    
    
            
            
        }
   
    

