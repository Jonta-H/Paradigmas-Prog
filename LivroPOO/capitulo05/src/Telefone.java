public class Telefone {
    private String modelo;
    private String numero;
    private double custoMinuto;
    private double creditoInicial;

    public double getCreditoInicial(){
        return creditoInicial;
    }
    public void setCreditoInicial(double creditoInicial){
        if (creditoInicial >= 0)
            this.creditoInicial = creditoInicial;
        else
            System.out.println("O valor " + creditoInicial
                                + " não é válido para a propriedade CRÉDITOINICIAL.");
    }
    public double getCustoMinuto(){
        return custoMinuto;
    }
    public void setCustoMinuto(double custoMinuto){
        if (custoMinuto >= 0)
            this.custoMinuto = custoMinuto;
        else
            System.out.println("O valor " + custoMinuto
                                + " não é válido para a propriedade CUSTOMINUTO.");
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        if (modelo.trim().length() == 0)
            System.out.println("A propriedade MODELO não pode receber um valor NULO.");
        else
            this.modelo = modelo;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        if (numero.trim().length() == 0)
            System.out.println("A propriedade NUMERO não pode receber um valor NULO.");
        else
            this.numero = numero;
    }
}
