package SistemaVeiculos;

public class TestaVeiculos {
    public static void main(String[] args){
        Aviao av1 = new Aviao("Avião1", "Modelo1", 0, 2000);
        CarroEletrico cr1 = new CarroEletrico("BYD", "Dolphin", 0, 100);

        Veiculo veiculo = av1;
        veiculo.mover();

        veiculo = cr1;
        veiculo.mover();

    }
}
