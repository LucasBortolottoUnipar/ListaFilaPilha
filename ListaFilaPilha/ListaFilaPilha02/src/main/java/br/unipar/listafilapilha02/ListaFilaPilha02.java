package br.unipar.listafilapilha02;

import java.util.Scanner;

public class ListaFilaPilha02 {

    public static void main(String[] args) {
        Fila filaPrioritaria = new Fila(100);
        Fila filaNormal = new Fila(100);
        Scanner s = new Scanner(System.in);
        int opcao;
        int senha = 1;
        int contadorPrioritario = 0;
        
          do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar cliente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine();
            
          switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do cliente: ");
                    String nome = s.nextLine();
                    System.out.print("Informe o ano de nascimento do cliente: ");
                    int anoNascimento = s.nextInt();
                    s.nextLine();
                    
                    Cliente cliente = new Cliente(senha++, nome, anoNascimento);
                    int idade = cliente.getIdade(2024);
                    
                    if (idade > 65) {
                        if (!filaPrioritaria.isFull()) {
                            filaPrioritaria.enqueue(cliente);
                            System.out.println("Cliente " + nome + " adicionado à fila prioritária.");
                        } else {
                            System.out.println("A fila prioritária está cheia.");
                        }
                    } else {
                        if (!filaNormal.isFull()) {
                            filaNormal.enqueue(cliente);
                            System.out.println("Cliente " + nome + " adicionado à fila normal.");
                        } else {
                            System.out.println("A fila normal está cheia.");
                        }
                    }
                    break;
                    
                case 2:
                    if (contadorPrioritario < 2 && !filaPrioritaria.isEmpty()) {
                        Cliente clientePrioritario = filaPrioritaria.dequeue();
                        System.out.println("Chamando cliente prioritário: " + clientePrioritario.getNome() + " (Senha: " + clientePrioritario.getSenha() + ")");
                        contadorPrioritario++;
                    } else if (!filaNormal.isEmpty()) {
                        Cliente clienteNormal = filaNormal.dequeue();
                        System.out.println("Chamando cliente normal: " + clienteNormal.getNome() + " (Senha: " + clienteNormal.getSenha() + ")");
                        contadorPrioritario = 0; 
                    } else if (!filaPrioritaria.isEmpty()) {
                        Cliente clientePrioritario = filaPrioritaria.dequeue();
                        System.out.println("Chamando cliente prioritário: " + clientePrioritario.getNome() + " (Senha: " + clientePrioritario.getSenha() + ")");
                        contadorPrioritario = 1; 
                    } else {
                        System.out.println("Nenhum cliente na fila para chamar.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Saindo do sistema.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        } while (opcao != 3);
    }
}
