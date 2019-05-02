package me.andredezzy.exercisesrunner.utils;

import java.util.HashMap;
import java.util.Map;

public class NumberTranslator {

    private static Map<Integer, String> TRANSLATIONS;

    static {
        TRANSLATIONS = new HashMap<Integer, String>();
        
        TRANSLATIONS.put(0, "zero");
        TRANSLATIONS.put(1, "one");
        TRANSLATIONS.put(2, "two");
        TRANSLATIONS.put(3, "three");
        TRANSLATIONS.put(4, "four");
        TRANSLATIONS.put(5, "five");
        TRANSLATIONS.put(6, "six");
        TRANSLATIONS.put(7, "seven");
        TRANSLATIONS.put(8, "eight");
        TRANSLATIONS.put(9, "nine");
        TRANSLATIONS.put(10, "ten");
    }

    public static String getTranslationFor(int number) {
        return TRANSLATIONS.get(number);
    }
}
