package service;

import domain.Carro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ui {
    public void menu(Scanner scanner){

        int opcao = -1;
        CarroService carroService = new CarroService();

        do {
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Adicionar turbo");
            System.out.println("4 - Remover Carro");
            System.out.println("0 - Sair");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e){
                System.out.println("O usuario deve Digitar apenas número!");
                scanner.nextLine();
                opcao = -1;
            }
            switch (opcao){
                case 1:
                    System.out.println("Qual nome do Carro deseja adicionar? ");
                    String nome = scanner.nextLine();

                    System.out.println("Qual Marca deseja adicionar? ");
                    String marca = scanner.nextLine();

                    System.out.println("Qual Cor do veiculo? ");
                    String cor = scanner.nextLine();

                    Carro novoCarro = new Carro(nome, marca, cor);
                    carroService.adicionarCarro(novoCarro);
                    System.out.println("Carro Adicionado com sucesso!");
                    break;
                case 2:
                    carroService.listarCarros();
                    break;
                case 3:
                    carroService.listarCarros();
                    System.out.println("Qual Carro deseja Adicionar Turbo? Escolha o numero: ");
                    try {
                        int opAddTurbo = scanner.nextInt();
                        scanner.nextLine();
                        carroService.adicionarTurbo(opAddTurbo);
                        System.out.println("Turbo Adicionado com sucesso! ");
                    } catch (InputMismatchException e){
                        System.out.println("Escolha apenas o número!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Índice inválido! Escolha um número da lista.");
                    }
                    break;

                case 4:
                    carroService.listarCarros();
                    System.out.println("Escolha de 0 até " + (carroService.totalCarros() - 1));
                    try {
                        int opRemove = scanner.nextInt();
                        scanner.nextLine();
                        carroService.removerCarro(opRemove);
                        carroService.listarCarros();
                        System.out.println("Carro removido com Sucesso!");
                    } catch (InputMismatchException e){
                        System.out.println("Escolha apenas um número!");
                    } catch (IndexOutOfBoundsException e){
                        System.out.println("Índice inválido! Escolha um número da lista.");
                    }
                    break;

            }
        }while (opcao != 0);
    }
}
