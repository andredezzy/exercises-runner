/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4ex30;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atv4ex30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////Entrada
        Scanner input = new Scanner (System.in);
        ///CapitainComando
        int matri;
        String name;
        System.out.println("Digite aqui seu nome completo: ");
        name = input.nextLine();
        System.out.println("Digite aqui sua matrícula: ");
        matri = input.nextInt();
        System.out.println(name + " " + (matri / 1000000 % 100000 )  + "" + ( matri % 10));
        
    }
}
