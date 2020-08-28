/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv17ex82;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv17ex82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scann
        Scanner input = new Scanner (System.in);
        //Var
        int n;
        //Cap
        System.out.println("Digite o código do produto: ");
        n = input.nextInt();
        if (n==1){
            System.out.println("Sul");
        }if (n ==2){
            System.out.println("Norte");
        }if (n==3){
            System.out.println("Leste");
        }if (n==4){
            System.out.println("Oeste");
    }
    }
    
}
