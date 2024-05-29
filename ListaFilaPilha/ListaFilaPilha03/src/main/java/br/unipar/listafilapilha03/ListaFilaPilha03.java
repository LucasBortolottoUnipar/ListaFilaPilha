package br.unipar.listafilapilha03;

import java.util.Scanner;

public class ListaFilaPilha03 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner s = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar livro à pilha");
            System.out.println("2 - Listar livros da pilha");
            System.out.println("3 - Retirar livro da pilha");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Informe o título do livro: ");
                    String titulo = s.nextLine();
                    System.out.print("Informe o autor do livro: ");
                    String autor = s.nextLine();
                    System.out.print("Informe o ano de publicação do livro: ");
                    int anoPublicacao = s.nextInt();
                    s.nextLine();

                    Livro livro = new Livro(titulo, autor, anoPublicacao);
                    pilha.push(livro);
                    System.out.println("Livro adicionado à pilha.");
                    break;

                case 2:
                    System.out.println("Listando livros da pilha:");
                    pilha.listarLivros();
                    break;

                case 3:
                    Livro livroRemovido = pilha.pop();
                    if (livroRemovido != null) {
                        System.out.println("Livro removido da pilha: " + livroRemovido);
                    } else {
                        System.out.println("A pilha está vazia. Nenhum livro para remover.");
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
