package estacionamento;

public class PerfilRotativo implements PerfilCobranca {

    public static final double VALOR_HORA = 8.00;

    @Override
    public String getNome() {
        return "Rotativo";
    }

    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (int) Math.ceil(minutos / 60.0);
        return horasIniciadas * VALOR_HORA; 
    }
}
