public class Email extends CanalNotificacao{
    private String assunto;

    public Email(){super();}
    public Email(String destinatario, String mensagem, String assunto){
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public void enviar(){
        System.out.printf("Enviando e-mail para %s com o assunto: %s%n", this.destinatario, this.assunto);
    }

}
