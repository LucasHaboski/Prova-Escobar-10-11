package estoque;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private final List<ABSObserver> observers = new ArrayList<>();
    private final String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void attach(ABSObserver observer) {
        observers.add(observer);
    }

    public void detach(ABSObserver observer) {
        observers.remove(observer);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (this.quantidade == quantidade) {
            return;
        }
        this.quantidade = quantidade;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (ABSObserver observer : observers) {
            observer.update(nome, quantidade);
        }
    }
}
