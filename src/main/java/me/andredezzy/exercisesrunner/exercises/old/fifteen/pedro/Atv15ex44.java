/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv15ex44;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv15ex44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        //Variables
       double t1, t2, t3;
       double quant1, quant2, quant3, total;
       double tt1, tt2, tt3;
       t1 = 0.50;
       t2 = 0.60;
       t3 = 0.75;
               
       //CapComands
        System.out.println("Quantidade picolé 1, picolé 2 e picolé 3: ");
       quant1 = input.nextDouble();
       quant2 = input.nextDouble();
       quant3 = input.nextDouble();
      
       tt1 = quant1 * t1;
       tt2 = quant2 * t2;
       tt3 = quant3 * t3;
       
       total = tt3 + tt2 + tt1;
        System.out.println("Quantidade vendida: " + quant1 + quant2 + quant3);
        System.out.println("Total: " + total);
        
       
       
       
       
    }
    
}
