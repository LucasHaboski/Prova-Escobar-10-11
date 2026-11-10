package estacionamento;

import java.util.Locale;

public class Main {

    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {

        int minutos = 210;

        System.out.println("Mesmo tempo (" + minutos + " min) nos tres perfis ");
        imprimir(new Tiquete("AWY2F23", minutos, new PerfilRotativo()));
        imprimir(new Tiquete("DDD4G76", minutos, new PerfilMensalista()));
        imprimir(new Tiquete("KELV143", minutos, new PerfilConveniado()));

        System.out.println("\nTroca de perfil no mesmo tiquete");
        Tiquete tiquete = new Tiquete("ABC4A55", 95, new PerfilRotativo());
        imprimir(tiquete);

        tiquete.setPerfil(new PerfilConveniado());
        imprimir(tiquete);

        tiquete.setPerfil(new PerfilMensalista());
        imprimir(tiquete);
    }

    private static void imprimir(Tiquete tiquete) {
        System.out.printf(PT_BR, "Placa %s | %d min | %-10s -> R$ %.2f%n",
                tiquete.getPlaca(), tiquete.getMinutos(),
                tiquete.getPerfil().getNome(), tiquete.calcularValor());
    }
}
