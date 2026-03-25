public class Pleno extends Desenvolvedor{
    private int projetosEntregues;

    public Pleno(){
        super();
    }

    public Pleno(String nome, float salarioBase, String linguagem, int projetosEntregues){
        super(nome, salarioBase, linguagem);
        this.projetosEntregues = projetosEntregues;
    }
}
