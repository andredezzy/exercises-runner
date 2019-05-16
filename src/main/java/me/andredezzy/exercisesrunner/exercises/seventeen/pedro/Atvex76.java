/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvex76;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atvex76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scann
        Scanner input = new Scanner (System.in);
      //Var
     int day, mes, year;
      //Cap
        System.out.println("Digite aqui o dia, o mês e o ano: ");
        day = input.nextInt();
        mes = input.nextInt();
        year = input.nextInt();
        if ((mes >= 1 ) && (mes <=3)){
            System.out.println("Verão");
        }if ((mes >=4) && (mes <= 6)){
            System.out.println("Primavera");
        }if ((mes >=7 ) && (mes <= 9)){
            System.out.println("Outono");
           
        }
        
      
    }
    
}
