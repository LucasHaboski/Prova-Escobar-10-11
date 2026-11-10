package estoque;

public class Vendas extends ABSObserver {

    private int quantidadeAnterior;

    public Vendas(Produto subject) {
        this.subject = subject;
        this.quantidadeAnterior = subject.getQuantidade();
        this.subject.attach(this);
    }

    @Override
    public void update(String nomeProduto, int quantidade) {
        if (quantidadeAnterior == 0 && quantidade > 0) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto + " voltou a ter estoque (" + quantidade + " unidades)");
        }
        quantidadeAnterior = quantidade;
    }
}
