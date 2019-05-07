package me.andredezzy.exercisesrunner.utils;

public class Formatter {

    public static int isInteger(String s, int ifNot) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
        }

        return ifNot;
    }
}
