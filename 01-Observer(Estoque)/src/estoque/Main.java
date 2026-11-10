package estoque;

public class Main {
    public static void main(String[] args) {

        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras(notebook);
        new Vendas(notebook);
        new Auditoria(notebook);

        System.out.println("Alteracao 1: 10 -> 7 ");
        notebook.setQuantidade(7);

        System.out.println("\nAlteracao 2: 7 -> 3 ");
        notebook.setQuantidade(3);

        System.out.println("\nAlteracao 3: 3 -> 3");
        notebook.setQuantidade(3);

        System.out.println("\nAlteracao 4: 3 -> 0 ");
        notebook.setQuantidade(0);

        System.out.println("\nAlteracao 5: 0 -> 12 ");
        notebook.setQuantidade(12);

        System.out.println("\nRemovendo Compras ");
        notebook.detach(compras);

        System.out.println("\nAlteracao 6: 12 -> 2 ");
        notebook.setQuantidade(2);
        
    }
}
