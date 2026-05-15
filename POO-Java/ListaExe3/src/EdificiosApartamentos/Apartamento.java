package EdificiosApartamentos;

public class Apartamento {
    private int numero, andar;

    public Apartamento() {
    }

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public String toString() {
        return "\nApartamento{" +
                "numero=" + numero +
                ", andar=" + andar +
                '}';
    }
}
