/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv17ex72;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv17ex72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scan
        Scanner input = new Scanner (System.in);
        //Var
        String name;
        int age;
        //Cap
        System.out.println("Digite aqui o nome do atleta: ");
        name = input.next();
        System.out.println("Digite a idade: ");
        age = input.nextInt();
        //Condições
        if ((age >= 5) && (age <=10)){
            System.out.println("Infantil");
        }if ((age > 10) && (age <= 15)){
            System.out.println("Juvenil");
        }if ((age > 15) && (age <= 20)){
            System.out.println("Junior");
        }if ((age >20) && (age <=25 )){
            System.out.println("Profissional");
        }
        }
        }
       
        
        
    
    

