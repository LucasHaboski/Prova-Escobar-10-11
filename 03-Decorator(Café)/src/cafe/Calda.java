package cafe;

public class Calda extends Complemento {

    public static final double PRECO = 2.50;

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Calda";
    }

    @Override
    protected double getValor() {
        return PRECO;
    }
}
