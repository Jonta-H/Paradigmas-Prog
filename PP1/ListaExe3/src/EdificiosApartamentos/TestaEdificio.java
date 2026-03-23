package EdificiosApartamentos;

public class TestaEdificio {
    public static void main(String[] args){
        Edificio ed1 = new Edificio(1, "Rua do zé");

        ed1.construirApartamento(1,1);
        ed1.construirApartamento(2,1);
        ed1.construirApartamento(5,4);
        ed1.construirApartamento(7,5);

        ed1.listarApartamentos();

        ed1 = null;

        ed1.listarApartamentos();
        // Não existe mais Edificio e consequentemente não há mais Apartamentos
    }
}
