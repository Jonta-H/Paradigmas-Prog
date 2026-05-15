package CineTeatro;

public class Filme {
    private int id, duracao;
    private String titulo, genero;

    public Filme(int id, String titulo, String genero, int duracao){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public int getId(){
        return this.id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getDuracao(){
        return this.duracao;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
