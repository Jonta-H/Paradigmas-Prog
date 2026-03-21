package SistemaBiblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args){
        Livro livro = new Livro(25, "João", "A Fera");
        Leitor leitor = new Leitor(10, "Pedro");
        LocalDateTime dataDevolucao = LocalDateTime.of(2026,3,28,23,59);

        Emprestimo emp1 = new Emprestimo(LocalDateTime.now(), dataDevolucao, leitor, livro);

        System.out.println(emp1.toString());
    }
}
