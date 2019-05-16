/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv17ex86;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv17ex86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Digite aqui o mês: ");
        int mes = input.nextInt();

        if ((mes >= 1 ) && (mes <=3)){
            System.out.println("Verão");
        }if ((mes >=4) && (mes <= 6)){
            System.out.println("Outono");
        }if ((mes >=7 ) && (mes <= 9)){
            System.out.println("Inverno");
        }if ((mes >9)&& (mes<=12))
        {System.out.println("Primavera");
                
    }
    }}

