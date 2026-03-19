package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("12345", "Zé");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Voo voo1 = new Voo(777, "RP", "Brasilia", data);
        System.out.println(voo1.toString());


        Reserva res1 = new Reserva(1234, LocalDateTime.now(), 5, pas1, voo1);
        System.out.println(res1.toString());

        // exibir o destino do voo atraves da reserva
        String destino = res1.getVoo().getDestino();
        System.out.println("Voo com destino " + destino);

        // exibir o nome do passageiro atraves da reserva
        String passageiro = res1.getPassageiro().getNome();
        System.out.println("Passageiro " + passageiro);
    }
}
