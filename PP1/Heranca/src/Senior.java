public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior(){
        super();
    }

    public Senior(String nome, float salarioBase, String linguagem, float verbaLider){
        super(nome, salarioBase, linguagem);
        this.verbaLider = verbaLider;
    }
}
