package me.andredezzy.exercisesrunner.utils.asker;

import java.util.Scanner;

public class AskerImpl implements Asker {

    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    @Override
    public String askForString() {
        return SCANNER.next();
    }

    @Override
    public String askForText() {
        Scanner scanner = new Scanner(System.in);
        
        return scanner.nextLine();
    }

    @Override
    public int askForInt() {
        return SCANNER.nextInt();
    }

    @Override
    public double askForDouble() {
        return SCANNER.nextDouble();
    }

    @Override
    public boolean askForBoolean() {
        String response = this.askForText();
        boolean bool = false;

        if(response.startsWith("S")) {
            bool = true;
        }

        return bool;
    }

    @Override
    public double askForPercentage() {
        String percentageString = this.askForString();

        double parsedDouble = Double.parseDouble(percentageString.replace("%", ""));

        return (parsedDouble / 100) + 1;
    }
}
