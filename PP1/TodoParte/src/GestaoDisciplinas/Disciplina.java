package GestaoDisciplinas;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Avaliacao> listaAvaliacoes;

    public Disciplina() {
        this.listaAvaliacoes = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.listaAvaliacoes = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
        System.out.print("Aluno matriculado.\n");
    }

    public void criarAvaliacao(int id, String nome){
        this.listaAvaliacoes.add(new Avaliacao(id, nome));
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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", alunos=" + listaAlunos + '\'' +
                ", avaliações= " + listaAvaliacoes + '\'' +
                '}';
    }
}
