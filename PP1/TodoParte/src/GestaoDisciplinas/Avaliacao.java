package GestaoDisciplinas;

import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> listaQuestoes;

    public Avaliacao() {
        this.listaQuestoes = new ArrayList<>();
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.listaQuestoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso){
        this.listaQuestoes.add(new Questao(num, texto, peso));
        System.out.println("Questão adicionada.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n\t\tAvaliacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", questoes= " + listaQuestoes + '\'' +
                '}';
    }
}
