package br.unipar.listafilapilha03;

import java.util.ArrayList;

public class Pilha {
    
    private ArrayList<Livro> livros;
    
    public Pilha() {
        livros = new ArrayList<>();
    }
    
    public void push(Livro livro) {
        livros.add(livro);
    }
    
    public Livro pop() {
        if (!livros.isEmpty()) {
            return livros.remove(livros.size() - 1);
        } else {
            return null;
        }
    }
    
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            for (int i = livros.size() - 1; i >= 0; i--) {
                System.out.println(livros.get(i));
            }
        }
    }
    
    public boolean isEmpty() {
        return livros.isEmpty();
    }
}
