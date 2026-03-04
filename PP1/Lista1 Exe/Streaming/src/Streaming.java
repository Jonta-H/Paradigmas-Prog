public class Streaming{
    public String usuario;
    public boolean status;
    public String ultimoFilmeAssistido;
    public Plano plano;

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = new Plano(plano);
        this.status = true;
        this.ultimoFilmeAssistido = "";
    }

    public Plano getPlano(){
        return this.plano;
    }

    public String getStatus(){
        if (this.status){
            return "Ativo";
        }else{
            return "Suspenso";
        }
    }

    public void assistirFilme(String nomeFilme){
        if (this.status){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("- Assintindo: " + nomeFilme);
        } else{
            System.out.println("* Conta inativa *");
        }
    }

    public void cancelarAssinatura(){
        this.status = false;
    }
    public void reativarAssinatura(){
        this.status = true;
    }

    public String toString(){
        return "----------------" +
                "\nUsuario: " + this.usuario +
                "\nPlano: " + this.getPlano().tipo +
                "\nMensalidade " + this.getPlano().mensalidade +
                "\nUltimo filme assistido: " + this.ultimoFilmeAssistido +
                "\nStatus: " + this.getStatus() +
                "\n----------------";
    }

}