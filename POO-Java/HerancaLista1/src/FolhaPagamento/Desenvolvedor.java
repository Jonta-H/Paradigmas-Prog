package FolhaPagamento;

public class Desenvolvedor{
    protected String nome, linguagem;
    protected float salarioBase;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String linguagem, float salario) {
        this.nome = nome;
        this.salarioBase = salario;
        this.linguagem = linguagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salarioBase;
    }

    public void setSalario(float salario) {
        this.salarioBase = salario;
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
                ", salario=" + salarioBase +
                '}';
    }

    public void codar(){
        System.out.println("Desenvolvedor planeja e escreve código-fonte");
    }
    public float calcularBonus(){
        return this.salarioBase * 0.05f;
    }
}