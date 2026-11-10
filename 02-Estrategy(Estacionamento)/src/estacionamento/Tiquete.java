package estacionamento;

public class Tiquete {

    private final String placa;
    private final int minutos;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutos, PerfilCobranca perfil) {
        if (minutos < 0) {
            throw new IllegalArgumentException("Tempo nao pode ser negativo.");
        }
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        if (perfil == null) {
            throw new IllegalStateException("Nenhum perfil defindo.");
        }
        return perfil.calcular(minutos);
    }
}
