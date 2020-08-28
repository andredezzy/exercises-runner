/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv15ex42;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner (System.in);
        //Variable
        double art1, art2, art3, art4 ;
        double art11, art22, art33, art44;
        double art1desconto, art2desconto, art3desconto, art4desconto, total;
        double ar1, ar2, ar3, ar4;
        String name;
        //CapComands
        art11 = 10;
        art22 = 15;
        art33 = 5;
        art44 = 20;
        System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Deseja quantos artigos de cada: ");
        art1 = input.nextDouble();
        art2 = input.nextDouble();
        art3 = input.nextDouble();
        art4 = input.nextDouble();
        
        art1desconto = ((art1 * art11) / 10) * 9 ;
        art2desconto = ((art2 * art22) / 10) * 9;
        art3desconto = ((art3 * art33) / 10) * 9;
        art4desconto = ((art4 * art44) / 10) * 9;
        
        ar1 = ((art1 * art11) - art1desconto);
        ar2 = ((art2 * art22 ) - art2desconto);
        ar3 = ((art3 * art33 ) - art3desconto);
        ar4 = ((art4 * art44 ) - art4desconto);
        
        total = art1 + ar2 + ar3 + ar4;
        System.out.println("nome: " + name);
        System.out.println("Preço: " + art11 + art22 + art33 + art44);
        System.out.println("Preço com desconto: " + ar1 + ar2 + ar3 + ar4);
        System.out.println(total);
        
        
        
        
        
        
        
        
    }
    
}
