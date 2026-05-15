package ComponentesComputador;

public class Processador {
    private String marca, modelo;
    private float frequencia;

    public Processador() {
    }

    public Processador(String marca, float frequencia, String modelo) {
        this.marca = marca;
        this.frequencia = frequencia;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nProcessador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia=" + frequencia +
                '}';
    }
}
