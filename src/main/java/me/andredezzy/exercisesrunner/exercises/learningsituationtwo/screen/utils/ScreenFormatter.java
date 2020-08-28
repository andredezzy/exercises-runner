package me.andredezzy.exercisesrunner.exercises.learningsituationtwo.screen.utils;

public class ScreenFormatter {

    public static final int DEFAULT_SCREEN_SPACING = 41;

    public static void print(String s) {
        print(s, true);
    }

    public static void fill(char c) {
        print(appendCharacterFor(c, DEFAULT_SCREEN_SPACING), false);
    }

    public static void print(String s, boolean initialSpace) {
        if (s != null) {
            if (initialSpace) {
                s = "  " + s;
            }

            int calculatedSpacing = calculateSpacingCount(s);
            String spacingAppend = appendCharacterFor(' ', calculatedSpacing);

            System.out.println("|" + s + spacingAppend + "|");
        } else {
            System.out.println("|" + appendCharacterFor(' ', DEFAULT_SCREEN_SPACING) + "|");
        }
    }

    public static int calculateSpacingCount(String menuName) {
        int menuNameLenght = menuName.length();

        return DEFAULT_SCREEN_SPACING - menuNameLenght;
    }

    public static String appendCharacterFor(char c, int count) {
        StringBuilder spacingStringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            spacingStringBuilder.append(c);
        }

        return spacingStringBuilder.toString();
    }
}
