package VendasSupermercado;

public class TestaSupermercado {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(1, "João");
        Venda venda1 = new Venda(cliente1);

        Produto p1 = new Produto(1, "Feijão", 5);
        Produto p2 = new Produto(2, "Arroz", 6);
        Produto p3 = new Produto(3, "Macarrão", 5);
        Produto p4 = new Produto(4, "Bolacha", 1);

        venda1.adicionarItem(1, 1, p1);
        venda1.adicionarItem(2, 2, p2);
        venda1.adicionarItem(3, 5, p3);
        venda1.adicionarItem(4, 10, p4);

        System.out.println(venda1.toString());

        venda1 = null;

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Os itens da venda são perdidos
        System.out.println(venda1.toString());
    }
}
