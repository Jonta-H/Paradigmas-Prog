public class SmartTV{
    private String marca, modelo;
    private int volume;

    public SmartTV(){}

    public SmartTV(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
    }

    // Set atribui valor a variável privada.
    // Recebe um valor como parâmetro e não retorna nada
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }else System.out.println("Volume inválido.");
    }

    // Get resgata o valor da variável.
    // O método deve possuir um tipo e um return para o respectivo valor
    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        if (!marca.isEmpty()){
            this.marca = marca;
        } else System.out.println("Insira uma marca");
    }
    public void setModelo(String modelo){
        if (!modelo.isEmpty()){
            this.modelo = modelo;
        } else System.out.println("Insira um modelo");
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
}