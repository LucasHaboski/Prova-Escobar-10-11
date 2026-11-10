package cafe;

public class Espresso implements Bebida {

    public static final double PRECO = 8.25;

    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
