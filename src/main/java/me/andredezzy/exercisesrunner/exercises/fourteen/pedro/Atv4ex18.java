/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex18;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double comprimento, largura, altura, volume;
        //ComandsCapitan;
        System.out.println("Digite aqui o comprimento, largura e altura: ");
        comprimento = input.nextDouble ();
        largura = input.nextDouble();
        altura = input.nextDouble();
        volume = comprimento * largura * altura;
        System.out.println("O volume é: " + volume);
        
        
        
    }
    
}
