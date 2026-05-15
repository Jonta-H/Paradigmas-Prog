public class WhatsApp extends CanalNotificacao{
    private String statusLeitura;

    public WhatsApp(){super();}
    public WhatsApp(String destinatario, String mensagem, String statusLeitura){
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    public void enviar(){
        System.out.printf("Enviando Zap para %s... Mensagem: %s%n", this.destinatario, this.mensagem);
    }
}
