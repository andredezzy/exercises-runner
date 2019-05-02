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
        return SCANNER.next();
    }
}
