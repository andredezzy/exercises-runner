/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv17ex80;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Atv17ex80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scann
        Scanner input = new Scanner (System.in);
        //var
    int n;
    //Cap
        System.out.println("Digite aqui um número: ");
        n = input.nextInt();
        if (n == 1 ){
            System.out.println("Domingo");
            
        }
        if (n == 2 ){
            System.out.println("Segunda");
            
        }
        if (n == 3){
            System.out.println("Terça");
            
        }
        if (n == 4 ){
            System.out.println("Quarta");
            
        }
        if (n == 5){
            System.out.println("Quinta");
            
        }
        if (n == 6){
            System.out.println("Sexta");
            
        }if (n == 7 ){
            System.out.println("Sábado");
            
        }if ((n  >7)||(n<0)){
            System.out.println("Inválido");
            
        }
        
        
        
    
    }
    
    
}
