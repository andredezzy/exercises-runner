package me.andredezzy.exercisesrunner.exercises.three;

import me.andredezzy.exercisesrunner.exercises.Exercise;

import java.util.Scanner;

/*
        Informe o nome do vendedor: Teste
        Informe o salário fixo de Teste: 100
        Informe o total de vendas de Teste: 10
        Informe o percentual no qual Teste recebe em cima do total de vendas: 5

        > O salário total de Teste é: $150.0
*/
public class Four implements Exercise {

    public int getId() {
        return 4;
    }

    public void run(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        String sellerName = scanner.nextLine();

        System.out.print(String.format("Informe o salário fixo de %s: ", sellerName));
        double fixSalary = scanner.nextDouble();

        System.out.print(String.format("Informe o total de vendas de %s: ", sellerName));
        int totalSales = scanner.nextInt();

        System.out.print(String.format("Informe o percentual no qual %s recebe em cima do total de vendas: ", sellerName));
        double salesPercentage = scanner.nextDouble();

        double totalSalary = fixSalary + (fixSalary * (totalSales * (salesPercentage / 100)) /* salesPercentage = 2 -> 2/100 -> 0.02 */);

        System.out.println(String.format("%n> O salário total de %s é: $%s", sellerName, totalSalary));
    }
}
