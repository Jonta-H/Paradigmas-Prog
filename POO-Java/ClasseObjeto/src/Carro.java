public class Carro{
    // variáveis ou propriedade ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo de dado primitivo
    public boolean motor; // boolean é um tipo de dado primitivo

    // método construtor - tem o mesmo nome da classe
    public Carro(String marca, String modelo, float velocidade, boolean motor){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    // método para ligar o carro
    public void ligarCarro(){
        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor ligado.");
        }
    }
    public void desligarCarro(){
        if (this.motor){
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Motor desligado.");
        }
    }
    public void aumentarVelocidade(float v){
        if (this.motor) {
            this.velocidade += v;
            System.out.println("O carro esta a " + this.velocidade + " km/h.");
        }
    }

    public void reduzirVelocidade(float r){
        if (this.motor && this.velocidade - r >= 0){
            this.velocidade -= r;
            System.out.println("Velocidade reduzida para " + this.velocidade + " km/h.");
        }
    }

    // método que converte o objeto em String
    public String toString(){
        // this representa o objeto que chama o método
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }


}