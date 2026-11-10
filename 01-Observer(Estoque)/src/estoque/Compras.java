package estoque;

public class Compras extends ABSObserver {

    private static final int ESTOQUE_MINIMO = 5;

    public Compras(Produto subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(String nomeProduto, int quantidade) {
        if (quantidade < ESTOQUE_MINIMO) {
            System.out.println("[Compras] ALERTA: " + nomeProduto + " com estoque baixo (" + quantidade + " unidades)");
        }
    }
}
