package br.unipar.listafilapilha01;

import java.util.Scanner;

public class ListaFilaPilha01 {

    public static void main(String[] args) {
        Fila fila = new Fila(20); // Tamanho da fila é 20
        Scanner s = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = s.nextInt();
            s.nextLine(); 
            
            switch(opcao) {
                case 1:
                    if(!fila.isFull()) {
                        System.out.print("Informe o nome do paciente: ");
                        String nome = s.nextLine();
                        fila.enqueue(nome);
                        System.out.println("Paciente " + nome + " adicionado a fila.");
                    } else {
                        System.out.println("A fila está cheia. Não e possível adicionar mais pacientes.");
                    }
                    break;
                case 2:
                    if(!fila.isEmpty()) {
                        String nome = fila.dequeue();
                        System.out.println("Próximo paciente: " + nome);
                    } else {
                        System.out.println("A fila está vazia. Nenhum paciente para chamar.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
            
        } while(opcao != 3);
    }
}
