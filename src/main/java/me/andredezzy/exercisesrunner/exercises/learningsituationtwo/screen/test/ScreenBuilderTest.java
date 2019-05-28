package me.andredezzy.exercisesrunner.exercises.learningsituationtwo.screen.test;

import me.andredezzy.exercisesrunner.exercises.learningsituationtwo.screen.ScreenBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ScreenBuilderTest {

    private static final int DEFAULT_SCREEN_SPACING = 41;

    public static void main(String[] args) {
        ScreenBuilder testScreenBuilder = new ScreenBuilder("SISTEMA DE GESTÃO ESCOLAR", "Cadastro", false);
        
        testScreenBuilder.addOption("Aluno", new Consumer<ScreenBuilder.Option>() {
            public void accept(ScreenBuilder.Option option) {
                System.out.println(option.getIndex() + " | " + option.getDisplayName());
            }
        });
        testScreenBuilder.addOption("Processo Seletivo", new Consumer<ScreenBuilder.Option>() {
            public void accept(ScreenBuilder.Option option) {
                System.out.println(option.getIndex() + " | " + option.getDisplayName());
            }
        });
        
        testScreenBuilder.build().captureAndDispatch();
    }

    private static void printScreen(String menuName, List<String> options, LastOptionType lastOptionType) {
        print(appendCharacterFor('-', DEFAULT_SCREEN_SPACING), false);
        print("      SISTEMA DE GESTÃO ESCOLAR");
        print(appendCharacterFor('-', DEFAULT_SCREEN_SPACING), false);

        print("MENU - " + menuName.toUpperCase());

        print(appendCharacterFor(' ', DEFAULT_SCREEN_SPACING), false);

        int optionCount;
        for (optionCount = 0; optionCount < options.size(); optionCount++) {
            print(String.format("[%s] %s", (optionCount + 1), options.get(optionCount).toUpperCase()));
        }

        print(" |");
        print(String.format("[%s] %s", (optionCount + 1), lastOptionType.getDisplayName()));

        print(appendCharacterFor('-', DEFAULT_SCREEN_SPACING), false);
    }

    private static void printInputReceiver() {
        System.out.println("|");
        System.out.print("|-> ");
    }

    private static void print(String s) {
        print(s, true);
    }

    private static void print(String s, boolean initialSpace) {
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

    private static int calculateSpacingCount(String menuName) {
        int menuNameLenght = menuName.length();

        return DEFAULT_SCREEN_SPACING - menuNameLenght;
    }

    private static String appendCharacterFor(char c, int count) {
        StringBuilder spacingStringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            spacingStringBuilder.append(c);
        }

        return spacingStringBuilder.toString();
    }

    public enum LastOptionType {

        EXIT("SAIR DO SISTEMA"), BACK("VOLTAR");

        private String displayName;

        LastOptionType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
