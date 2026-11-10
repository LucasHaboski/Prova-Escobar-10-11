package cafe;

public class Leite extends Complemento {

    public static final double PRECO = 1.75;

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Leite";
    }

    @Override
    protected double getValor() {
        return PRECO;
    }
}
