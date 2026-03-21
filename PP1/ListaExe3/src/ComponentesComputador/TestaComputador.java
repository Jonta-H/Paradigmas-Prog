package ComponentesComputador;

public class TestaComputador {
    public static void main(String[] args){
        Computador computador = new Computador(5, "Alienware", "Intel", "i5-1000", 3.5F);

        System.out.println(computador.toString());

        computador = null;

        // Processador deixa de existir junto com o Computador
    }
}
