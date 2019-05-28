package me.andredezzy.exercisesrunner.exercises.learningsituationtwo;

import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.exercises.learningsituationtwo.screen.ScreenBuilder;

// learningsituationtwo
public class LearningSituation implements Exercise {

    private static final String DEFAULT_MENU_TITLE = "SISTEMA DE GESTÃO ESCOLAR";

    public static void main(String[] args) {
        new LearningSituation().run(null);
    }

    public void run(String[] args) {
        int mainMenuSelectedOptionIndex = 0;

        while (mainMenuSelectedOptionIndex != 4) {
            ScreenBuilder mainScreenBuilder = new ScreenBuilder(DEFAULT_MENU_TITLE, "Principal", true);

            mainScreenBuilder.addOption("Cadastrar", null);
            mainScreenBuilder.addOption("Consultar", null);
            mainScreenBuilder.addOption("Impressão", null);

            mainMenuSelectedOptionIndex = mainScreenBuilder.build().capture();

            this.separator();

            if (mainMenuSelectedOptionIndex == 4) {
                System.out.println("|-> Saindo...");
                return;
            }

            switch (mainMenuSelectedOptionIndex) {
                case 1:
                    int registerMenuSelectedOptionIndex = 0;

                    while (registerMenuSelectedOptionIndex != 5) {
                        ScreenBuilder registerScreenBuilder = new ScreenBuilder(DEFAULT_MENU_TITLE, "Cadastro", false);

                        registerScreenBuilder.addOption("Aluno", null);
                        registerScreenBuilder.addOption("Turma", null);
                        registerScreenBuilder.addOption("Docentes", null);
                        registerScreenBuilder.addOption("Notas", null);

                        registerMenuSelectedOptionIndex = registerScreenBuilder.build().capture();

                        switch (registerMenuSelectedOptionIndex) {
                            case 1:
                                int studentMenuSelectedOptionIndex = 0;

                                while (studentMenuSelectedOptionIndex != 4) {
                                    ScreenBuilder studentScreenBuilder = new ScreenBuilder(DEFAULT_MENU_TITLE, "ALUNO", false);

                                    studentScreenBuilder.addOption("Cadastrar", null);
                                    studentScreenBuilder.addOption("Processo Seletivo", null);
                                    studentScreenBuilder.addOption("Matricula", null);

                                    studentMenuSelectedOptionIndex = studentScreenBuilder.build().capture();
                                }

                                break;
                            case 2:
                                int classRoomMenuSelectedOptionIndex = 0;

                                while (classRoomMenuSelectedOptionIndex != 3) {
                                    ScreenBuilder classRoomScreenBuilder = new ScreenBuilder(DEFAULT_MENU_TITLE, "Turma", false);

                                    classRoomScreenBuilder.addOption("Cadastrar", null);
                                    classRoomScreenBuilder.addOption("Aluno", null);

                                    classRoomMenuSelectedOptionIndex = classRoomScreenBuilder.build().capture();
                                }

                                break;
                        }
                    }

                    break;
                case 2:
                    int consultMenuSelectedOptionIndex = 0;

                    while (consultMenuSelectedOptionIndex != 6) {
                        ScreenBuilder consultScreenBuilder = new ScreenBuilder(DEFAULT_MENU_TITLE, "Consulta", false);

                        consultScreenBuilder.addOption("Processo Seletivo", null);
                        consultScreenBuilder.addOption("Aluno por Turma", null);
                        consultScreenBuilder.addOption("Alunos Matriculados", null);
                        consultScreenBuilder.addOption("Notas por Aluno", null);
                        consultScreenBuilder.addOption("Docentes Ativos", null);

                        consultMenuSelectedOptionIndex = consultScreenBuilder.build().capture();
                    }

                    break;
                case 3:
                    int printMenuSelectedOptionIndex = 0;

                    while (printMenuSelectedOptionIndex != 6) {
                        ScreenBuilder printScreenBuilder = new ScreenBuilder(DEFAULT_MENU_TITLE, "Impressão", false);

                        printScreenBuilder.addOption("Alunos Matriculados", null);
                        printScreenBuilder.addOption("Alunos por Turma", null);
                        printScreenBuilder.addOption("Processo Seletivo", null);
                        printScreenBuilder.addOption("Notas por Aluno", null);
                        printScreenBuilder.addOption("Notas dos Alunos por Turma", null);

                        printMenuSelectedOptionIndex = printScreenBuilder.build().capture();
                    }

                    break;
            }

            this.separator();
        }
    }

    private void separator() {
        System.out.println("|");
        System.out.println("|");
    }
}
