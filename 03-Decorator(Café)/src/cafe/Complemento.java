package cafe;

public abstract class Complemento implements Bebida {

    protected final Bebida bebida;

    public Complemento(Bebida bebida) {
        if (bebida == null) {
            throw new IllegalArgumentException("Bebida nao pode ser nula.");
        }
        this.bebida = bebida;
    }

    protected abstract String getNome();

    protected abstract double getValor();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", " + getNome();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + getValor();
    }
}
