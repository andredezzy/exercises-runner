package me.andredezzy.exercisesrunner.exercises.learningsituationtwo;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;

// learningsituationtwo
public class LearningSituation implements Exercise {

    public void run(String[] args) {
        int mainMenuSelectedOptionIndex = 0;

        while (mainMenuSelectedOptionIndex != 4) {
            System.out.println("|----------------------------------------|");
            System.out.println("|       SISTEMA DE GESTÃO ESCOLAR        |");
            System.out.println("|----------------------------------------|");
            System.out.println("|  MENU PRINCIPAL                        |");
            System.out.println("|                                        |");
            System.out.println("|  [1] CADASTRAR                         |");
            System.out.println("|  [2] CONSULTAR                         |");
            System.out.println("|  [3] IMPRESSÃO                         |");
            System.out.println("|   |                                    |");
            System.out.println("|  [4] SAIR DO SISTEMA                   |");
            System.out.println("|----------------------------------------|");
            System.out.println("|");
            System.out.print("|-> ");

            mainMenuSelectedOptionIndex = Application.ASKER.askForInt();

            System.out.println("|");
            System.out.println("|");

            if (mainMenuSelectedOptionIndex == 4) {
                System.out.println("|-> Saindo...");
                return;
            }

            switch (mainMenuSelectedOptionIndex) {
                case 1:
                    int registerMenuSelectedOptionIndex = 0;

                    while (registerMenuSelectedOptionIndex != 5) {
                        System.out.println("|----------------------------------------|");
                        System.out.println("|       SISTEMA DE GESTÃO ESCOLAR        |");
                        System.out.println("|----------------------------------------|");
                        System.out.println("|  MENU DE CADASTRO                      |");
                        System.out.println("|                                        |");
                        System.out.println("|  [1] ALUNO                             |");
                        System.out.println("|  [2] TURMA                             |");
                        System.out.println("|  [3] DOCENTES                          |");
                        System.out.println("|  [4] NOTAS                             |");
                        System.out.println("|   |                                    |");
                        System.out.println("|  [5] VOLTAR                            |");
                        System.out.println("|----------------------------------------|");
                        System.out.println("|");
                        System.out.print("|-> ");

                        registerMenuSelectedOptionIndex = Application.ASKER.askForInt();

                        switch (registerMenuSelectedOptionIndex) {
                            case 1:
                                int studentMenuSelectedOptionIndex = 0;

                                while (studentMenuSelectedOptionIndex != 4) {
                                    System.out.println("|----------------------------------------|");
                                    System.out.println("|       SISTEMA DE GESTÃO ESCOLAR        |");
                                    System.out.println("|----------------------------------------|");
                                    System.out.println("|  MENU DE CADASTRO DO ALUNO             |");
                                    System.out.println("|                                        |");
                                    System.out.println("|  [1] CADASTRAR                         |");
                                    System.out.println("|  [2] PROCESSO SELETIVO                 |");
                                    System.out.println("|  [3] MATRICULA                         |");
                                    System.out.println("|   |                                    |");
                                    System.out.println("|  [4] VOLTAR                            |");
                                    System.out.println("|----------------------------------------|");
                                    System.out.println("|");
                                    System.out.print("|-> ");

                                    studentMenuSelectedOptionIndex = Application.ASKER.askForInt();
                                }

                                break;
                            case 2:
                                int classRoomMenuSelectedOptionIndex = 0;

                                while (classRoomMenuSelectedOptionIndex != 3) {
                                    System.out.println("|----------------------------------------|");
                                    System.out.println("|       SISTEMA DE GESTÃO ESCOLAR        |");
                                    System.out.println("|----------------------------------------|");
                                    System.out.println("|  MENU DE CADASTRO DA TURMA             |");
                                    System.out.println("|                                        |");
                                    System.out.println("|  [1] CADASTRAR                         |");
                                    System.out.println("|  [2] ALUNO                             |");
                                    System.out.println("|   |                                    |");
                                    System.out.println("|  [3] VOLTAR                            |");
                                    System.out.println("|----------------------------------------|");
                                    System.out.println("|");
                                    System.out.print("|-> ");

                                    classRoomMenuSelectedOptionIndex = Application.ASKER.askForInt();
                                }

                                break;
                        }
                    }

                    break;
                case 2:
                    int consultMenuSelectedOptionIndex = 0;

                    while (consultMenuSelectedOptionIndex != 6) {
                        System.out.println("|----------------------------------------|");
                        System.out.println("|       SISTEMA DE GESTÃO ESCOLAR        |");
                        System.out.println("|----------------------------------------|");
                        System.out.println("|  MENU DE CONSULTA                      |");
                        System.out.println("|                                        |");
                        System.out.println("|  [1] PROCESSO SELETIVO                 |");
                        System.out.println("|  [2] ALUNO POR TURMA                   |");
                        System.out.println("|  [3] ALUNOS MATRICULADOS               |");
                        System.out.println("|  [4] NOTAS POR ALUNOS                  |");
                        System.out.println("|  [5] DOCENTES ATIVOS                   |");
                        System.out.println("|   |                                    |");
                        System.out.println("|  [6] VOLTAR                            |");
                        System.out.println("|----------------------------------------|");
                        System.out.println("|");
                        System.out.print("|-> ");

                        consultMenuSelectedOptionIndex = Application.ASKER.askForInt();
                    }

                    break;
                case 3:
                    int printMenuSelectedOptionIndex = 0;

                    while (printMenuSelectedOptionIndex != 6) {
                        System.out.println("|----------------------------------------|");
                        System.out.println("|       SISTEMA DE GESTÃO ESCOLAR        |");
                        System.out.println("|----------------------------------------|");
                        System.out.println("|  MENU DE IMPRESSÃO                     |");
                        System.out.println("|                                        |");
                        System.out.println("|  [1] ALUNOS MATRICULADOS               |");
                        System.out.println("|  [2] ALUNOS POR TURMA                  |");
                        System.out.println("|  [3] PROCESSO SELETIVO                 |");
                        System.out.println("|  [4] NOTAS POR ALUNO                   |");
                        System.out.println("|  [5] NOTAS DOS ALUNOS POR TURMA        |");
                        System.out.println("|   |                                    |");
                        System.out.println("|  [6] VOLTAR                            |");
                        System.out.println("|----------------------------------------|");
                        System.out.println("|");
                        System.out.print("|-> ");

                        printMenuSelectedOptionIndex = Application.ASKER.askForInt();
                    }

                    break;
            }

            System.out.println("|");
            System.out.println("|");
        }
    }
}
