import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main(String[] args){
        ArrayList<CanalNotificacao> lista = new ArrayList<>();

        Email email = new Email("Jonata", "Boa noite!", "Testando");
        SMS sms = new SMS("Jão", "Oii", 123456789);
        WhatsApp zap = new WhatsApp("Maria", "Bom dia", "Não lido");

        lista.add(email);
        lista.add(sms);
        lista.add(zap);

        lista.forEach(CanalNotificacao::enviar);

    }

}
