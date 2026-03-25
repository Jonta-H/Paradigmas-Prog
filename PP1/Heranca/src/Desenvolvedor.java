public class Desenvolvedor{
    protected String nome, linguagem;
    protected float salario;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, float salario, String linguagem) {
        this.nome = nome;
        this.salario = salario;
        this.linguagem = linguagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}