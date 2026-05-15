public class SmartTV{
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTV(){}

    public SmartTV(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadaInternet = false;
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
        if (!marca.isEmpty() && marca.length() <= 30){
            this.marca = marca;
        } else System.out.println("Insira uma marca (Max. 30 Caracteres)");
    }
    public void setModelo(String modelo){
        if (!modelo.isEmpty() && Character.isUpperCase(modelo.charAt(0))){
            this.modelo = modelo;
        } else System.out.println("Insira um modelo válido");
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setConectadoInternet(boolean conectadaInternet){
        this.conectadaInternet = conectadaInternet;
    }
    public boolean isConectadaInternet(){
        return this.conectadaInternet;
    }

    public void abrirYoutube(){
        // conectar-se na internet
        if (this.conectarInternet()) {
            System.out.println("Abrindo... YouTube");
        } else System.out.println("YouTube não pôde ser aberto, verifique a conexão com a Internet.");
    }

    private boolean conectarInternet(){
        System.out.println("Buscando sinal de Wi-Fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP no roteador...");
        // Chance de conectar 50/50
        int randomico = (int) (Math.random()*10);
        if (randomico < 5){
            System.out.println("Conectado\n");
            return true;
        } else {
            System.out.println("Falha na conexão\n");
            return false;
        }
    }

    // aumentar o volume em x
    public void aumentarVolume(int x){
        this.setVolume(this.volume + x);
    }

    // diminuir o volume em x
    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }

}