package GestaoDisciplinas;

public class Aluno {
    private int id;
    private String nome, ra, curso;

    public Aluno() {
    }

    public Aluno(int id, String curso, String nome, String ra) {
        this.id = id;
        this.curso = curso;
        this.nome = nome;
        this.ra = ra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n\tAluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
