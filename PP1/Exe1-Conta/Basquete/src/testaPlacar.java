public class testaPlacar {
    public static void main(String[] args){
        Placar jogo1 = new Placar("Franca", "Bauru");

        System.out.println(jogo1.toString());
        jogo1.registrarPonto("Casa", 3);
        jogo1.proximoQuarto();
        jogo1.registrarPonto("Visitante", 1);
        jogo1.proximoQuarto();

        System.out.println(jogo1.toString());
    }
}
