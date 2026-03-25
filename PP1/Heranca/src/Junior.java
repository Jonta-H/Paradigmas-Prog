public class Junior extends Desenvolvedor{
    private String mentor;

    public Junior() {
        super(); // chama o construtor da superClasse
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, salarioBase, linguagem);
        this.mentor = mentor;
    }
}
