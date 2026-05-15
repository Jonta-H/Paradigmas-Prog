package CineTeatro;

import java.lang.invoke.SwitchPoint;
import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args){
        Filme f1 = new Filme(1, "Batman", "Ação/Aventura", 120);
        Filme f2 = new Filme(2, "Duna", "Ficção Científica", 170);

        Sessao sessao = new Sessao(1, 1, LocalDateTime.of(2026, 7, 20, 20,0));

        sessao.vincularFilme(f1);

        System.out.println(sessao.toString());

        sessao.venderIngresso(1, "H3", "Meia", 15);
        sessao.venderIngresso(2, "H4", "Meia", 15);
        sessao.venderIngresso(3, "K7", "Inteira", 29);

        System.out.println(sessao.toString());

        sessao.listarIngressos();
    }
}
