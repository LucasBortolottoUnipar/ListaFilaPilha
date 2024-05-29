package br.unipar.listafilapilha04;

import java.util.Scanner;

public class ListaFilaPilha04 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(10); // Limite de 10 caixas
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
                        System.out.println("Produto adicionado à pilha.");
                    } else {
                        System.out.println("A pilha está cheia. Não é possível adicionar mais produtos.");
                    }
                    break;

                case 2:
                    System.out.println("Listando produtos da pilha:");
                    pilha.listarProdutos();
                    break;

                case 3:
                    Produto produtoRemovido = pilha.pop();
                    if (produtoRemovido != null) {
                        System.out.println("Produto removido da pilha: " + produtoRemovido);
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
