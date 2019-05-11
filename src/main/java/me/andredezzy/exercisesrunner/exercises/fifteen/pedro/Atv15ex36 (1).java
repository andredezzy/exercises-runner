/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex36;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scanner
        Scanner input = new Scanner(System.in);
        //Variables
        double venda, totalVendas;
        String name;
        double comissao;
        //CapComands
        System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Digite quanto vendeu: ");
        venda = input.nextDouble();
        if (venda > 50000) {
            venda = (50000 + (50000) / 12);
        }

        if ((venda < 50000) && (venda > 30000)) {
            venda = (venda + (venda) / 9.5);
        } else {
            venda = venda + (venda / 7);
        };
         System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Digite quanto vendeu: ");
        venda = input.nextDouble();
        if (venda > 50000) {
            venda = (50000 + (50000) / 12);
        }

        if ((venda < 50000) && (venda > 30000)) {
            venda = (venda + (venda) / 9.5);
        } else {
            venda = venda + (venda / 7);
             System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Digite quanto vendeu: ");
        venda = input.nextDouble();
        }
        if (venda > 50000) {
            venda = (50000 + (50000) / 12);
        }

        if ((venda < 50000) && (venda > 30000)) {
            venda = (venda + (venda) / 9.5);
        } else {
            venda = venda + (venda / 7);}
        System.out.println("Nome: " + name);
        System.out.println("Vendeu: " + venda);
        totalVendas = venda * 3;
        System.out.println("total de vendas: " + totalVendas);
        
        
    }

}

