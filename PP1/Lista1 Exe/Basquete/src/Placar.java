public class Placar{
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String getNomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = getNomeTimeVisitante;
        this.pontosVisitante = 0;
        this.pontosCasa = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int ponto){
        if (time.equals("Casa")){
            this.pontosCasa += ponto;
        } else if (time.equals("Visitante")) {
            this.pontosVisitante += ponto;
        }
    }

    public void proximoQuarto(){
        if (this.periodoQuarto < 4){
            this.periodoQuarto += 1;
        } else {
            System.out.println("* Fim de Jogo! *");
        }
    }

    public String toString(){
        return "\n-- PLACAR --" +
                "\nTime A [" + this.pontosCasa + "] x [" + this.pontosVisitante + "] Time B" +
                "\nPeríodo: " + this.periodoQuarto + "º Quarto";
    }
}