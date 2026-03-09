package ArCondicionado;

public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){}

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }

    public void setTemperatura(int t){
        if (t >= 16 && t <= 30){
            this.temperatura = t;
        } else System.out.println("Temperatura fora da faixa.");
    }

    public void setMarca(String m){
        if (m.length() >= 3){
            this.marca = m;
        } else System.out.println("Marca inválida. Mínimo de 3 caracteres.");
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public void setLigado(boolean l){
        this.ligado = l;
    }

    public void ativarModoTurbo(){
        if (this.verificarCompressor()){
            System.out.println("Turbo ativado.");
            this.setTemperatura(16);
        }
    }

    private boolean verificarCompressor(){
        int random = (int) (Math.random()*10);
        System.out.println(random > 2 ? "Compressor verificado" : "Falha no compressor");
        return random > 2;
    }

    public String toString(){
        return "--------------------------" +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nTemperatura: " + this.temperatura +
                "\nLigado: " + ((this.ligado) ? "Ligado":"Desligado") +
                "\n--------------------------";
    }
}
