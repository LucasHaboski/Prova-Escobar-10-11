package cafe;

import java.util.Locale;

public class Main {

    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {

        Bebida pedido1 = new Leite(new Espresso());

        Bebida pedido2 = new Calda(new Chantilly(new Leite(new Cha())));

        Bebida pedido3 = new Chantilly(new Leite(new Leite(new Espresso()))); /*TesTar adicionar o mesmo complemento mais de uma vez */

        Bebida pedido4 = new Cha();

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
        imprimir(4, pedido4);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.printf(PT_BR, "Pedido %d: %s -> R$ %.2f%n",
                numero, pedido.getDescricao(), pedido.getPreco());
    }
}
