package DroneProfissional;

public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(){}

    public Drone(String codigo, float altura, int bateria){
        this.codigo = codigo;
        this.setAltura(altura);
        this.setBateria(bateria);
        this.emVoo = false;
    }

    public void setAltura(float altura){
        if (altura >= 0 && altura <= 120){
            this.altura = altura;
        } else System.out.println("Altura inválida");
    }

    public void setBateria(int bateria){
        if (bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        } else System.out.println("Valor inválido");
    }

    public void decolar(){
        if (this.bateria > 20 && this.testarMotores()){
            this.emVoo = true;
            this.setAltura(2);
            System.out.println("Decolando...");
        } else System.out.println("Não foi possível decolar");
    }

    private boolean testarMotores(){
        System.out.println("Testando hélices...\nCalibrando GPS...");
        int random = (int) (Math.random()*10);
        return random < 8;
    }

    public void subir(float x){
        this.setAltura(this.altura + x);
    }

    public void descer(float x){
        this.setAltura((this.altura - x));
    }

    public String toString(){
        return "--------------------------" +
                "\nCódigo: " + this.codigo +
                "\nAltura: " + this.altura +
                "\nBateria: " + this.bateria +
                "\nSituação: " + ((this.emVoo) ? "Voando":"No chão") +
                "\n--------------------------";
    }
}
