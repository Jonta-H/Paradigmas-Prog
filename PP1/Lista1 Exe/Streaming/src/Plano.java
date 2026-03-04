public class Plano {
    public String tipo;
    public double mensalidade;

    public Plano(String tipo){
        this.tipo = tipo;
        if(tipo.equals("Básico")){
            this.mensalidade = 25.9;
        } else if (tipo.equals("Premium")) {
            this.mensalidade = 45.9;
        } else if (tipo.equals("Família")) {
            this.mensalidade = 60.9;
        }
    }

}
