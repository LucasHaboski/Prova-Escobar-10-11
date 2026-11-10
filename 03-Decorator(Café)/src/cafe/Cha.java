package cafe;

public class Cha implements Bebida {

    public static final double PRECO = 5.50;

    @Override
    public String getDescricao() {
        return "Cha";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
