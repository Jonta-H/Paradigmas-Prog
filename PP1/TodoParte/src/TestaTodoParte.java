import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){

        // cria um objeto da classe Cliente independente
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente("1", "123456789", "José", 5);

        // cria um objeto todo
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido(1, new Date(), cl2);

        System.out.println(pedido2.toString());
    }
}
