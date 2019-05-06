/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex16;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int a, b, c;
        //ComandsCapitan
        System.out.println("Digite aqui dois números: ");
        a = input.nextInt();
        b = input.nextInt();
       c = a;
       a = b;
       b = c;
               
        System.out.println("Os números trocados são: " + a  +  b);
        
        
                
        
    }
    
}
