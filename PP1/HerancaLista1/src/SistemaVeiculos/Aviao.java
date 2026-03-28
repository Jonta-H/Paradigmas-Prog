package SistemaVeiculos;

public class Aviao extends Veiculo{
    private float altitudoMax;

    public Aviao(){}

    public Aviao(String marca, String modelo, float velocidade, float altitudoMax){
        super(marca, modelo, velocidade);
        this.altitudoMax = altitudoMax;
    }

    public float getAltitudoMax() {
        return altitudoMax;
    }

    public void setAltitudoMax(float altitudoMax) {
        this.altitudoMax = altitudoMax;
    }

    @Override
    public void mover(){
        System.out.printf("""
                Avião voando a %.2f km/h e %.2f metros.
                """, this.velocidade, this.altitudoMax);
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação.");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                super.toString() +
                "altitudoMax=" + altitudoMax +
                '}';
    }
}
