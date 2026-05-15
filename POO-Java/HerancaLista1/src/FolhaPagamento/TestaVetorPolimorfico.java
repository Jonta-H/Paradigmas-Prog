package FolhaPagamento;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class TestaVetorPolimorfico {
    public static void main(String[] args){
        ArrayList<Desenvolvedor> vetor = new ArrayList<>();

        vetor.add(new Junior("João", "Java", 15, "Zeca"));
        vetor.add(new Pleno("Pedro", "C#", 30, 1));
        vetor.add(new Senior("Roberto", "Python", 50, 100));
        vetor.add(new Desenvolvedor("Junior", "PHP", 20));

        vetor.forEach(dev -> {
            dev.codar();
            System.out.println("Bônus "+ dev.calcularBonus());
            System.out.println(dev.toString() + "\n");
        });

    }
}
