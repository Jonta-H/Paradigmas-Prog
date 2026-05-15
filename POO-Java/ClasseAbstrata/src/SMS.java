public class SMS extends CanalNotificacao{
    private int nroTelefone;

    public SMS(){super();}
    public SMS(String destinatario, String mensagem, int nroTelefone){
        super(destinatario, mensagem);
        this.nroTelefone = nroTelefone;
    }

    public void enviar(){
        System.out.printf("Enviando SMS para o número %d: %s%n", this.nroTelefone, this.mensagem);
    }
}
