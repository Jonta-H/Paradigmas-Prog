import java.util.Calendar;

public class Cliente{
    private String nome;
    private Calendar nascimento;

    public Cliente(String nome, Calendar nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Calendar getNascimento(){
        return nascimento;
    }
    public String getNome(){
        return nome;
    }
    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}