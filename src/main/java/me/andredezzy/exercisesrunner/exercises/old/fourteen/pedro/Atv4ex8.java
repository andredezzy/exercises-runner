/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double base, altura, area;
        
        System.out.println("Digite aqui a base: ");
        base = input.nextDouble();
        System.out.println("Digite agora a altura: ");
        altura = input.nextDouble();
        area = (base * altura) / 2;
        System.out.println("A área do triângulo é: "+ area);
    }
    
}
