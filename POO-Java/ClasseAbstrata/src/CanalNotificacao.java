public abstract class CanalNotificacao{
    protected String destinatario, mensagem;

    public CanalNotificacao(){}

    public CanalNotificacao(String destinatario, String mensagem){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void exibirDados(){
        System.out.printf("Destinatário: %s%nMensagem: %s", this.destinatario, this.mensagem);
    }

    public abstract void enviar();

}