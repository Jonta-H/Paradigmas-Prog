public class TestaCarro {
    public static void main(String[] args){
        // instanciar objeto obj1
        Carro obj1 = new Carro("Fiat", "Uno", 0, false);
        System.out.println(obj1.toString());

        // instanciar objeto obj2
        Carro obj2 = new Carro("GM", "Onix", 0, false);
        System.out.println(obj2.toString());
        obj2.ligarCarro();
        System.out.println(obj2.toString());
        obj2.desligarCarro();
        System.out.println(obj2.toString());
        obj2.ligarCarro();

        obj2.aumentarVelocidade(80);
        obj2.reduzirVelocidade(30);
    }
}
