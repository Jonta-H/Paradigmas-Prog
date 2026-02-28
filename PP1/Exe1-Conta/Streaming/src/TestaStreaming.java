public class TestaStreaming {
    public static void main(String[] args){
        Streaming c1 = new Streaming("José", "Família");

        System.out.println(c1.toString());
        c1.assistirFilme("La La Land");
        c1.cancelarAssinatura();
        System.out.println(c1.toString());
    }
}
