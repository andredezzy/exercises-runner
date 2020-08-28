/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex14;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        double volume, raio, altura;
        System.out.println("Digite aqui o raio e a altura: ");
        raio = input.nextDouble();
        altura = input.nextDouble();
        volume = 3.14159 * Math.pow (raio, 2) * altura;
        System.out.println("O volume é: " + volume) ;
        
                
        
                
        
    }
    
}
