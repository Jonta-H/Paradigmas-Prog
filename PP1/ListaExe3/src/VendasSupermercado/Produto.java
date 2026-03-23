package VendasSupermercado;

public class Produto {
    private int id;
    private String nome;
    private float preco;

    public Produto(){}

    public Produto(int id, String nome, float preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    };

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public String toString(){
        return "\nProduto: " +
                "\n\t-Nome: " + this.getNome() +
                "\n\t-ID: " + this.getId() +
                "\n\t-Preço: " + this.getPreco();
    }
}
