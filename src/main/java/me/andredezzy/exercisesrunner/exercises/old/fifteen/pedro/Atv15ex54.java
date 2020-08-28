/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv15ex54;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        // Variables
        int opcao, n1, n2, n3;
        System.out.println("Digite aqui o valor de n1: ");
        n1 = input.nextInt();
        System.out.println("Digite o valor de n2: ");
        n2 = input.nextInt();
        System.out.println("Digite o valor de n3: ");
        n3 = input.nextInt();
        
        System.out.println("Digite aqui sua opção: ");
        opcao = input.nextInt();
        if (opcao == 2){
            System.out.println(n1);}
        if (opcao == 3){
            System.out.println(n2);}
        if (opcao ==4){
            System.out.println(n3);
            
        }
        
        
        
             
    }
    
}
