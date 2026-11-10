package cafe;

public class Chantilly extends Complemento {

    public static final double PRECO = 2.75;

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Chantilly";
    }

    @Override
    protected double getValor() {
        return PRECO;
    }
}
