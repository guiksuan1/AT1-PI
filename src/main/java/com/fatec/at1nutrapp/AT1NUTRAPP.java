package com.fatec.at1nutrapp;

import java.util.Scanner;

public class AT1NUTRAPP {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        // Variaveis globais do PI (apenas declaradas)
        String apresentacao = "";
        String[][] ods = new String[0][0];
        String[] equipe = new String[0];

        int opcaoPrincipal;
        do {
            // Menu principal
            System.out.println("\n----- NUTRAPP -----");
            System.out.println("1. Conhecer a Nutrapp");
            System.out.println("2. Editar Informacoes");
            System.out.println("3. Sair");
            System.out.print("Digite uma opcao: ");
            opcaoPrincipal = menu.nextInt();

            switch (opcaoPrincipal) {
                case 1: // VISUALIZAR
                    int opcaoSubmenu;
                    do {
                        System.out.println("\n----- MENU VISUALIZAR -----");
                        System.out.println("1. Apresentacao do projeto");
                        System.out.println("2. ODS");
                        System.out.println("3. Equipe");
                        System.out.println("4. Geral");
                        System.out.println("5. Voltar");
                        System.out.print("Escolha: ");
                        opcaoSubmenu = menu.nextInt();

                        switch (opcaoSubmenu) {
                            case 1:
                                if (apresentacao.isEmpty()) {
                                    System.out.println("\n[Sem apresentacao cadastrada]");
                                } else {
                                    System.out.println("\nApresentacao: " + apresentacao);
                                }
                                break;
                            case 2:
                                if (ods.length == 0) {
                                    System.out.println("\n[Sem ODS cadastradas]");
                                } else {
                                    for (int i = 0; i < ods.length; i++) {
                                        System.out.println("ODS " + ods[i][0] + " - " + ods[i][1]);
                                    }
                                }
                                break;
                            case 3:
                                if (equipe.length == 0) {
                                    System.out.println("\n[Sem equipe cadastrada]");
                                } else {
                                    System.out.println("\nEquipe:");
                                    for (String nome : equipe) {
                                        System.out.println("- " + nome);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("\nResumo Geral:");
                                if (equipe.length > 0) {
                                    System.out.println("Equipe:");
                                    for (String nome : equipe) {
                                        System.out.println("- " + nome);
                                    }
                                }
                                if (ods.length > 0) {
                                    for (int i = 0; i < ods.length; i++) {
                                        System.out.println("ODS " + ods[i][0] + " - " + ods[i][1]);
                                    }
                                }
                                if (!apresentacao.isEmpty()) {
                                    System.out.println("Apresentacao: " + apresentacao);
                                }
                                break;
                            case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opcaoSubmenu != 5); // CORRIGIDO
                    break;

                case 2: // EDITAR
                    int opcaoEditar;
                    do {
                        System.out.println("\n----- MENU EDITAR -----");
                        System.out.println("1. Alterar Apresentacao");
                        System.out.println("2. Alterar ODS");
                        System.out.println("3. Alterar Equipe");
                        System.out.println("4. Voltar");
                        System.out.print("Escolha: ");
                        opcaoEditar = menu.nextInt();

                        menu.nextLine(); // limpa o buffer antes (necessário se você usou nextInt antes)
                        switch (opcaoEditar) {
                            case 1:
                                System.out.print("Digite a nova apresentacao: ");
                                apresentacao = menu.nextLine(); // lê toda a linha com espaços
                                System.out.println("Apresentacao atualizada!");
                                break;
                            case 2:
                                System.out.print("Digite quantas ODS tem no seu projeto: ");
                                int qtdods = menu.nextInt();

                                ods = new String[qtdods][2];
                                for (int x = 0; x < qtdods; x++) {
                                    System.out.print("Digite o número da ODS " + (x + 1) + ": ");
                                    ods[x][0] = menu.next();
                                    System.out.print("Digite a descricao da ODS " + (x + 1) + ": ");
                                    ods[x][1] = menu.next();
                                }
                                System.out.println("ODS atualizadas!");
                                break;
                            case 3:
                                System.out.print("Quantos membros na equipe? ");
                                int quantidade = menu.nextInt();

                                equipe = new String[quantidade];
                                for (int i = 0; i < quantidade; i++) {
                                    System.out.print("Digite o nome do integrante " + (i + 1) + ": ");
                                    equipe[i] = menu.next();
                                }
                                System.out.println("Equipe atualizada!");
                                break;
                            case 4:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opcaoEditar != 4);
                    break;

                case 3:
                    System.out.println("Saindo do programa. Até logo!");
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.");
            }
        } while (opcaoPrincipal != 3);

        menu.close();
    }
}
