public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura{
    private double temperatura;
    private boolean status;

    public TermostatoSmart(double temperatura){
        this.temperatura = temperatura;
        this.status = true; // true = ligado
    }

    public double lerTemperatura(){
        if(this.status) {
            return this.temperatura;
        } else {
            System.out.println("Termostato desligado");
            return 0.0;
        }
    }

    public void ligar(){
        this.status = true;
        System.out.println("Termostato ligado");
    }

    public void desligar(){
        this.status = false;
        System.out.println("Termostato desligado");
    }

}
