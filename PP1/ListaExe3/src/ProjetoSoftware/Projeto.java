package ProjetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> listaProgramadores;

    public Projeto(){
        this.listaProgramadores = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto){
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.listaProgramadores = new ArrayList<>();
    }

    public void adicionarProgramador(Programador programador){
        this.listaProgramadores.add(programador);
    }

    public void listarProgramadores(){
        if(!this.listaProgramadores.isEmpty()) {
            System.out.println("Programadores:");
            for (Programador programador : this.listaProgramadores) {
                System.out.printf("""
                        Nome: %s\tLinguagem: %s
                        """, programador.getNome(), programador.getLinguagemPrincipal());
            }
        } else System.out.println("\nNão há nenhum programador trabalhando no projeto");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getListaProgramadores() {
        return listaProgramadores;
    }

    public void setListaProgramadores(ArrayList<Programador> listaProgramadores) {
        this.listaProgramadores = listaProgramadores;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", listaProgramadores=" + listaProgramadores +
                '}';
    }
}
