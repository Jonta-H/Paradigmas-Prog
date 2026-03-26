import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor dev){
        dev.codar();
        System.out.println(dev.toString() + " Bônus " + dev.calcularBonus());
    }

    public static void main(String[] args){
        Junior jr1 =
                new Junior("Fulano", "Java", 15, "Ciclano");
        exibir(jr1);

        Pleno pl1 =
                new Pleno("Zeca", 20, "Python", 5);
        exibir(pl1);

        Senior sr1 =
                new Senior("Jão", 30, "C#", 2);
        exibir(sr1);

        ArrayList<Desenvolvedor> empresa = new ArrayList<Desenvolvedor>();
        empresa.add(jr1);
        empresa.add(pl1);
        empresa.add(sr1);

    }
}
