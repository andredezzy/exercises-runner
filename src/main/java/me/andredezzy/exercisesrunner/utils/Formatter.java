package me.andredezzy.exercisesrunner.utils;

import java.text.DecimalFormat;

public class Formatter {

    public static int isInteger(String s, int ifNot) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
        }

        return ifNot;
    }

    public static String trim(double n, int decimals) {
        StringBuilder decimalsStringBuilder = new StringBuilder();

        for (int i = 0; i < decimals; i++) {
            decimalsStringBuilder.append("0");
        }

        DecimalFormat trimDecimalFormat = new DecimalFormat(String.format("0.%s", decimalsStringBuilder.toString()));

        return trimDecimalFormat.format(n);
    }
}
