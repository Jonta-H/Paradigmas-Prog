package VendasSupermercado;

public class ItemVenda {
    private int id, quantidade;
    private Produto produto;

    public ItemVenda(){
    }

    public ItemVenda(int id, int quantidade, Produto produto){
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto(){
        return this.produto;
    }
}
