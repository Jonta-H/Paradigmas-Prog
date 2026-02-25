package livro.telefone.beans;

import livro.iu.Console;

public class Operadora {
    private String nome;
    private Plano[] planos;
    private int proximoElemento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Operadora (String nome){
        planos = new Plano[10];
        proximoElemento = 0;
        this.nome = nome;
    }

    public void adicionaPlano(Plano plano){
        if (proximoElemento == planos.length) {
            Console.exibe("Não é possível adicionar mais planos para a operadora " + nome);
        } else {
            plano.setOperadora(this);
            planos[proximoElemento++] = plano;
        }
    }
}

