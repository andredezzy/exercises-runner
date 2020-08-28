/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv16ex2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv16ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner (System.in);
        //var
        int salario, finan;
        //Cap
        System.out.println("Digite aqui o seu salário: ");
        salario = input.nextInt();
        System.out.println("Digite o financiamento desejado: ");
        finan = input.nextInt();
        
        if (finan <= (5 * salario))
            System.out.println("Financiamento concedido");
        else
            System.out.println("Financiamento negado");
        
    }
    
}
