package estoque;

public abstract class ABSObserver {

    protected Produto subject;

    public abstract void update(String nomeProduto, int quantidade);

}
