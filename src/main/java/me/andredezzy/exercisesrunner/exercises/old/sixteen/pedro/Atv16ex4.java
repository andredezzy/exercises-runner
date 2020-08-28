/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atv16ex4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atv16ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner (System.in);
        //var
        String name;
        double salario, newSalario;
        //Cap
        System.out.println("Digite seu nome: ");
        name = input.next();
        System.out.println("Digite seu salário: ");
        salario = input.nextDouble();
        //IF
        if ((salario >= 0) && (salario <=400 )){
            newSalario = salario + (salario * 15) / 100;
                        System.out.println("Nome: " + name + " Salário antigo: " + salario + "Salário novo: " + newSalario);
        }if ((salario > 400) && (salario <= 700)){
            newSalario = salario + (salario * 12) / 100;
                        System.out.println("Nome: " + name + " Salário antigo: " + salario + "Salário novo: " + newSalario);
        }if ((salario > 700) && (salario <= 1000)){
            newSalario = salario + (salario * 10) / 100;
                        System.out.println("Nome: " + name + " Salário antigo: " + salario + "Salário novo: " + newSalario);
        }if ((salario >1000) && (salario <= 1800)){
            newSalario = salario + (salario * 7) / 100;
                        System.out.println("Nome: " + name + " Salário antigo: " + salario + "Salário novo: " + newSalario);
        }if ((salario > 1800) && (salario <=2500)){
            newSalario = salario + (salario * 4) / 100;
            
            System.out.println("Nome: " + name + " Salário antigo: " + salario + " Salário novo: " + newSalario);
                    
        }
        
    }
    
}
