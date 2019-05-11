/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv15ex32;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ATV15ex32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número: ");
        int n = input.nextInt();
        if (n <= 10)
            System.out.println("F1");
        else if (n > 10 && n <= 100)
            System.out.println("F2");
        else if (n >100)
            System.out.println("F3");
        
    }
    
}
