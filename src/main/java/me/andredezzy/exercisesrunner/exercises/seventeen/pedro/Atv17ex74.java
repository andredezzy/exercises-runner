/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv17ex74;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv17ex74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner (System.in);
        //Var
        int n;
        //Cap
        System.out.println("1- Venda a vista");
        System.out.println("2- Venda a prazo 30 dias ");
        System.out.println("3- Venda a prazo 60 dias ");
        System.out.println("4- Venda a prazo 90 dias");
        System.out.println("5- Venda com cartão de débito ");
        System.out.println("6- Venda com cartão de crédito");
        System.out.println("Digite a opção de 1 a 6 desejada: ");
        n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("Venda a vista");
                break;
            case 2:
                System.out.println(" Venda a prazo 30 dias ");
                break;
            case 3:
                System.out.println(" Venda a prazo 60 dias ");
                break;
            case 4:
                System.out.println("Venda a prazo 90 dias ");
                break;
            case 5:
                System.out.println("Venda com cartão de crédito");
                break;
            case 6:
                System.out.println("Venda com cartão de débito ");
                break;
            default:
                        System.out.println("INVÁLIDO SEU BOBÃO");
    }
    
    }}
