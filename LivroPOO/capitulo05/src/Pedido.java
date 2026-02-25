public class Pedido {
    private int mesa;
    private String cliente;
    private String garcom;
    private String produto;
    private double preco;
    private int quantidade;

    public int getMesa(){
        return mesa;
    }
    public void setMesa(int mesa){
        if (mesa >= 0)
            this.mesa = mesa;
        else
            System.out.println("Valor inválido.");
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        if (cliente.trim().length() == 0)
            System.out.println("Valor inválido.");
        else
            this.cliente = cliente;
    }
    public String getGarcom(){
        return garcom;
    }
    public void setGarcom(String garcom){
        if (garcom.trim().length() == 0)
            System.out.println("Valor inválido.");
        else
            this.garcom = garcom;
    }
    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto){
        if (produto.trim().length() == 0)
            System.out.println("Valor inválido.");
        else
            this.produto = produto;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if (preco >= 0)
            this.preco = preco;
        else
            System.out.println("Valor inválido.");
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        if (quantidade >= 0)
            this.quantidade = quantidade;
        else
            System.out.println("Valor inválido.");
    }
}
