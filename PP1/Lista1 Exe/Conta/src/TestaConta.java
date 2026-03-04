public class TestaConta {
    public static void main(String[] args){
        Conta c1 = new Conta(123, 10, "João Silva");

        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.toString());

        Conta c2 = new Conta(321, 11, "Maria Souza");
        System.out.println(c2.toString());
        c2.sacar(50);

        c1.encerrar();
        c1.sacar(c1.saldo);
        c1.encerrar();
        System.out.println(c1.toString());
    }
}
