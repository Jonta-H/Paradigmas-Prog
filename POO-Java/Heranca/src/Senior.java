public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior(){
        super();
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    public Senior(String nome, float salarioBase, String linguagem, float verbaLider){
        super(nome, salarioBase, linguagem);
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar(){
        System.out.println("Sênior definindo a arquitetura do software e liderando pessoas");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.30f;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }
}
