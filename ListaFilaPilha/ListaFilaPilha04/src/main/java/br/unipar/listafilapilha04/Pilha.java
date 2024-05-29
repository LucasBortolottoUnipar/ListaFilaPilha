package br.unipar.listafilapilha04;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<Produto> produtos;
    private int maxTamanho;
    
    public Pilha(int tamanho) {
        produtos = new ArrayList<>();
        this.maxTamanho = tamanho;
    }
    
    public void push(Produto produto) {
        if (produtos.size() < maxTamanho) {
            produtos.add(produto);
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar mais produtos.");
        }
    }
    
    public Produto pop() {
        if (!produtos.isEmpty()) {
            return produtos.remove(produtos.size() - 1);
        } else {
            System.out.println("A pilha está vazia. Nenhum produto para remover.");
            return null;
        }
    }
    
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            for (int i = produtos.size() - 1; i >= 0; i--) {
                System.out.println(i + " - " + produtos.get(i));
            }
        }
    }
    
    public boolean isEmpty() {
        return produtos.isEmpty();
    }
    
    public boolean isFull() {
        return produtos.size() >= maxTamanho;
    }
    
    public int size() {
        return produtos.size();
    }
}
