package VendasSupermercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda;

    public Venda() {
        this.itensVenda = new ArrayList<>();
    }

    public Venda(Cliente cliente){
        this.cliente = cliente;
        this.itensVenda = new ArrayList<>();
    }

    public void adicionarItem(int id, int quantidade, Produto produto){
        this.itensVenda.add(new ItemVenda(id, quantidade, produto));
    }

    private String listarItens(){
        String itens = "[";
        for(ItemVenda itemVenda : this.itensVenda){
            if (!itens.equals("[")){itens+= ", ";};
            itens += itemVenda.getProduto().getNome() + "(" + itemVenda.getId() + ")";
        }

        return itens + "]";
    }

    public String toString(){
        return "* Venda *" +
                "\nCliente: " + this.cliente.getNome() +
                "\nProdutos: " + this.listarItens();
    }
}
