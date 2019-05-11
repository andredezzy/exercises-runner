/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv15ex40;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        //variables
        double valorPorca, valorParafuso, valorArruelas, desconto, totalCompra, totalDesconto;
        String name;
        double porca, parafuso, arruelas;
        valorPorca = 10;
        valorParafuso = 5;
        valorArruelas = 2;
        
        //CapCOmands
        //comandsCAP
        System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Quantidade porcas, parafusos e arruelas: ");
        porca = input.nextDouble();
        parafuso = input.nextDouble();
        arruelas = input.nextDouble();
        
        porca = ((valorPorca * porca) / 10) * 9;
        parafuso = ((valorParafuso * parafuso) / 20 ) *9;
        arruelas = ((valorArruelas * arruelas ) / 30) * 9;
        totalCompra = arruelas + parafuso + porca;
        
        System.out.println(name);
        System.out.println(porca);
        System.out.println(parafuso);
        System.out.println(arruelas);
         System.out.println(totalCompra);
        
       
        
    }
    
}
