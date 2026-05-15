package ArCondicionado;

public class TestaArCondicionado {
    public static void main(String[] args){
        ArCondicionado ar1 = new ArCondicionado("Te", "Testando", 15, true);

        System.out.println(ar1.toString());

        ar1.ativarModoTurbo();

        System.out.println(ar1.toString());
    }
}
