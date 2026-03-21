package ProjetoSoftware;

public class TestaProjeto {
    public static void main(String[] args){
        Programador p1 = new Programador(1, "Zé", "Java");
        Programador p2 = new Programador(2, "João", "Python");
        Programador p3 = new Programador(3, "Pedro", "C++");
        Programador p4 = new Programador(4, "Lucas", "Go");

        Projeto projeto1 = new Projeto(5, "Sistema Bibliotecário");
        Projeto projeto2 = new Projeto(6, "Clinica Médica");

        projeto1.adicionarProgramador(p1);
        projeto1.adicionarProgramador(p2);
        projeto1.adicionarProgramador(p3);
        projeto1.adicionarProgramador(p4);

        projeto1.listarProgramadores();
        projeto2.listarProgramadores();

    }
}
