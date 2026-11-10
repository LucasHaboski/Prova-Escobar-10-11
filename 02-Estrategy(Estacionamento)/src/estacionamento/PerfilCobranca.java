package estacionamento;

public interface PerfilCobranca {

    String getNome();

    double calcular(int minutos);
}
