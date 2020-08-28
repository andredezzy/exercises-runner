package me.andredezzy.exercisesrunner.exercises.old.learningsituationtwo.screen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import me.andredezzy.exercisesrunner.Application;

import static me.andredezzy.exercisesrunner.exercises.old.learningsituationtwo.screen.utils.ScreenFormatter.*;

public class ScreenBuilder {

    private String title;
    private String menuName;
    private boolean isMainMenu;

    private List<Option> options;

    public ScreenBuilder(String title, String menuName, boolean isMainMenu) {
        this.title = title;
        this.menuName = menuName;
        this.isMainMenu = isMainMenu;
        this.options = new ArrayList<Option>();
    }

    public void addOption(String displayName, Consumer<Option> onSelectConsumer) {
        int optionIndex = this.options.size() + 1;

        Option option = new Option(optionIndex, displayName);
        option.onSelectConsumer(onSelectConsumer);

        this.options.add(option);
    }

    public ScreenBuilder build() {
        fill('-');
        print(this.title);
        fill('-');
        print(String.format("MENU - %s", menuName.toUpperCase()));
        fill(' ');

        for (int i = 1; i <= this.options.size(); i++) {
            Option optionByIndex = this.getOptionByIndex(i);

            print(String.format("[%s] %s", optionByIndex.getIndex(), optionByIndex.getDisplayName().toUpperCase()));
        }

        print(" |");
        print(String.format("[%s] %s", (this.options.size() + 1), this.isMainMenu ? "SAIR" : "VOLTAR"));

        fill('-');

        System.out.print("|\n|-> ");
        
        return this;
    }

    public int capture() {
        return Application.ASKER.askForInt();
    }

    public void captureAndDispatch() {
        int index = this.capture();

        Option optionByIndex = getOptionByIndex(index);

        if (optionByIndex != null) {
            optionByIndex.getOnSelectConsumer().accept(optionByIndex);
        }
    }

    private Option getOptionByIndex(int index) {
        for (Option option : this.options) {
            if (option.getIndex() == index) {
                return option;
            }
        }

        return null;
    }

    public static class Option {

        private int index;
        private String displayName;

        private Consumer<Option> onSelectConsumer;

        public Option(int index, String displayName) {
            this.index = index;
            this.displayName = displayName;
        }

        public int getIndex() {
            return index;
        }

        public String getDisplayName() {
            return displayName;
        }

        public Consumer<Option> getOnSelectConsumer() {
            return onSelectConsumer;
        }

        public void onSelectConsumer(Consumer<Option> onSelectConsumer) {
            this.onSelectConsumer = onSelectConsumer;
        }
    }
}
