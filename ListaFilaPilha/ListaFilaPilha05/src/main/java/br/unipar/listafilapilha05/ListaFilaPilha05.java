package br.unipar.listafilapilha05;

import java.util.Scanner;

public class ListaFilaPilha05 {

    public static void main(String[] args) {
        
        Pilha[] deposito = new Pilha[5];
        for (int i = 0; i < deposito.length; i++) {
            deposito[i] = new Pilha(10);
        }

        Scanner s = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar produto à pilha");
            System.out.println("2 - Listar produtos da pilha");
            System.out.println("3 - Retirar produto da pilha");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Selecione a pilha (0-4): ");
                    int pilhaSelecionada = s.nextInt();
                    s.nextLine();
                    if (pilhaSelecionada >= 0 && pilhaSelecionada < deposito.length) {
                        Pilha pilha = deposito[pilhaSelecionada];
                        if (!pilha.isFull()) {
                            System.out.print("Informe o código do produto: ");
                            int codProduto = s.nextInt();
                            s.nextLine(); 
                            System.out.print("Informe a descrição do produto: ");
                            String descricao = s.nextLine();
                            System.out.print("Informe a data de entrada do produto: ");
                            String dataEntrada = s.nextLine();
                            System.out.print("Informe a UF de origem: ");
                            String ufOrigem = s.nextLine();
                            System.out.print("Informe a UF de destino: ");
                            String ufDestino = s.nextLine();

                            Produto produto = new Produto(codProduto, descricao, dataEntrada, ufOrigem, ufDestino);
                            pilha.push(produto);
                            System.out.println("Produto adicionado à pilha " + pilhaSelecionada + ".");
                        } else {
                            System.out.println("A pilha " + pilhaSelecionada + " está cheia. Não é possível adicionar mais produtos.");
                        }
                    } else {
                        System.out.println("Pilha inválida. Escolha um número entre 0 e 4.");
                    }
                    break;

                case 2:
                    System.out.print("Selecione a pilha (0-4): ");
                    pilhaSelecionada = s.nextInt();
                    s.nextLine();
                    if (pilhaSelecionada >= 0 && pilhaSelecionada < deposito.length) {
                        System.out.println("Listando produtos da pilha " + pilhaSelecionada + ":");
                        deposito[pilhaSelecionada].listarProdutos();
                    } else {
                        System.out.println("Pilha inválida. Escolha um número entre 0 e 4.");
                    }
                    break;

                case 3:
                    System.out.print("Selecione a pilha (0-4): ");
                    pilhaSelecionada = s.nextInt();
                    s.nextLine();
                    if (pilhaSelecionada >= 0 && pilhaSelecionada < deposito.length) {
                        Produto produtoRemovido = deposito[pilhaSelecionada].pop();
                        if (produtoRemovido != null) {
                            System.out.println("Produto removido da pilha " + pilhaSelecionada + ": " + produtoRemovido);
                        }
                    } else {
                        System.out.println("Pilha inválida. Escolha um número entre 0 e 4.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 4);
    }
}
