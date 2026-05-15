package TimeBasquete;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> atletasEquipe;

    public Time(){
        this.atletasEquipe = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico){
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletasEquipe = new ArrayList<>();
    }

    public void contratarAtleta(Atleta atleta){
        this.atletasEquipe.add(atleta);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getAtletasEquipe() {
        return atletasEquipe;
    }

    public void setAtletasEquipe(ArrayList<Atleta> atletasEquipe) {
        this.atletasEquipe = atletasEquipe;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", atletasEquipe=" + atletasEquipe +
                '}';
    }
}
