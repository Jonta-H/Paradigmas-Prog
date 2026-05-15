package CineTeatro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private Filme filme;
    private ArrayList<Ingresso> listaIngressos;

    public Sessao(int id, int sala, LocalDateTime horario){
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.listaIngressos = new ArrayList<>();
    }

    public void vincularFilme(Filme filme){
        this.filme = filme;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco){
        this.listaIngressos.add(new Ingresso(id, assento, tipo, preco));
    }

    public void listarIngressos(){
        System.out.println("\nIngressos vendidos para " + this.filme.getTitulo());
        for(Ingresso ingresso : this.listaIngressos){
            System.out.println("\t"+ ingresso.toString());
        }
    }

    public String toString(){
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH'h'mm");
        return "\n* Sessão *" +
                "\n\tFilme: " + this.filme.getTitulo() +
                "\n\tGênero: " + this.filme.getGenero() +
                "\n\tDuração: " + this.filme.getDuracao() +
                "\n\tHorário: " + this.horario.format(formatoBR) +
                "\n\tIngressos vendidos: " + this.listaIngressos.size();
    }
}
