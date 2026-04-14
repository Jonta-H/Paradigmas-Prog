public class FechaduraEletronica implements Autenticavel, DispositivoLigavel{
    private String senha;
    private boolean autenticacao;

    public FechaduraEletronica(String senha){
        this.senha = senha;
        this.autenticacao = false; // "desligado"
    }

    public void validarAcesso(String senha){
        if(senha.equals(this.senha)){
            this.autenticacao = true;
            System.out.println("Acesso validado");
        } else System.out.println("Senha incorreta");
    }

    public void ligar() {
        if (this.autenticacao) {
            System.out.println("Destrancado");
        } else {
            System.out.println("Não autenticado");
        }
    }

    public void desligar(){
        if (this.autenticacao) {
            System.out.println("Trancado");
        } else {
            System.out.println("Não autenticado");
        }
    }
}
