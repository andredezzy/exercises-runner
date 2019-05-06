/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex26;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //////
        ////entrada
        Scanner input = new Scanner (System.in);
        ///////ComandsCapitan
        double gross, liquid, restliquid;
        System.out.println("Digite o seu salário bruto: ");
        gross = input.nextDouble();
        liquid = gross - gross * 0.1;
        restliquid = liquid - liquid * 0.05;
        System.out.println("O resto do seu salário é: " + restliquid);
        
        
       
    }
    
}
