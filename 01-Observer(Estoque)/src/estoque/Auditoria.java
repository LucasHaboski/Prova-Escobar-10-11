package estoque;

public class Auditoria extends ABSObserver {

    public Auditoria(Produto subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(String nomeProduto, int quantidade) {
        System.out.println("[Auditoria] Registro: " + nomeProduto + " -> " + quantidade + " unidades");
    }
}
