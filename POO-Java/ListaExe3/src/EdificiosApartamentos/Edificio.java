package EdificiosApartamentos;

import java.util.ArrayList;

public class Edificio {
    private int id;
    private String endereco;
    private ArrayList<Apartamento> listaApartamentos;

    public Edificio(){
        this.listaApartamentos = new ArrayList<>();
    }

    public Edificio(int id, String endereco){
        this.id = id;
        this.endereco = endereco;
        this.listaApartamentos = new ArrayList<>();
    }

    public void construirApartamento(int numero, int andar){
        this.listaApartamentos.add(new Apartamento(numero, andar));
    }

    public void listarApartamentos(){
        if(!this.listaApartamentos.isEmpty()){
            for(Apartamento apartamento : this.listaApartamentos){
                System.out.printf("""
                        Andar: %x\tNumero: %x
                        """, apartamento.getAndar(), apartamento.getNumero());
            }
        }
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", listaApartamentos=" + listaApartamentos +
                '}';
    }
}
