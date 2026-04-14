public class Teste {
    public static void main(String[] args){
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");
        TermostatoSmart termostato = new TermostatoSmart(20);

        fechadura.validarAcesso("1234");
        fechadura.ligar();
        fechadura.desligar();


        System.out.printf("%nTemperatura atual: %.1f°C%n", termostato.lerTemperatura());;
        termostato.desligar();

    }

}
