package me.andredezzy.exercisesrunner.utils.asker;

import java.util.Scanner;

public class AskerImpl implements Asker {

    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public String askForString() {
        return SCANNER.next();
    }

    public String askForText() {
        Scanner scanner = new Scanner(System.in);
        
        return scanner.nextLine();
    }

    public int askForInt() {
        return SCANNER.nextInt();
    }

    public double askForDouble() {
        return SCANNER.nextDouble();
    }

    public double askForPercentage() {
        String percentageString = this.askForString();

        double parsedDouble = Double.parseDouble(percentageString.replace("%", ""));

        return (parsedDouble / 100) + 1;
    }
}
