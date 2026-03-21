package ComponentesComputador;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(){}

    public Computador(int id, String marca, String marcaProcessador, String modeloProcessador, float frequencia){
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProcessador, frequencia, modeloProcessador);
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
