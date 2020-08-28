/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv15ex60;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv15ex60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        // variables
        int saldo;
        //Cap
        System.out.println("Digite aqui seu saldo médio: ");
        saldo = input.nextInt();
        if ((saldo >= 0) && (saldo <=200)){
            System.out.println("Nenhum crédito");
        } if ((saldo >200 ) && (saldo <=400 )){
            System.out.println( saldo + (saldo * 20) / 100 );}
        if ((saldo > 401) && (saldo <= 600)){
            System.out.println(saldo + (saldo * 30 )  / 100);
        } if  (saldo > 600){
            System.out.println(saldo + (saldo * 40) / 100);
        }
        }
        }
            
        
    
    

