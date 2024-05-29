package br.unipar.listafilapilha02;

public class Fila {
    private Cliente[] vetorDados;
    private int frente;
    private int fim;
    private int qtdItens;
    
    public Fila(int tamanho) {
        vetorDados = new Cliente[tamanho];
        frente = 0;
        fim = -1;
        qtdItens = 0;
    }
    
    public void enqueue(Cliente cliente) {
        if (fim == vetorDados.length - 1) {
            fim = -1;
        }
        
        vetorDados[++fim] = cliente;
        qtdItens++;
    }
    
    public Cliente dequeue() {
        Cliente aux = vetorDados[frente++];
        if (frente == vetorDados.length) {
            frente = 0;
        }
        qtdItens--;
        return aux;
    }
    
    public boolean isEmpty() {
        return qtdItens == 0;
    }
    
    public boolean isFull() {
        return qtdItens == vetorDados.length;
    }
    
    public int size() {
        return qtdItens;
    }
}
