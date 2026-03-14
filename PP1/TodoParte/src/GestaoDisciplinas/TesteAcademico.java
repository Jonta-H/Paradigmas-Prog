package GestaoDisciplinas;

public class TesteAcademico {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(343, "Sistemas de Informação", "Jefferson", "1234567-3");
        Aluno aluno2 = new Aluno(200, "Ciência da Computação", "Maria Clara", "8584273-2");

        Disciplina disciplinaPOO = new Disciplina(4, "Programação Orientada a Objetos", "Daniel Facciolo");

        disciplinaPOO.matricularAluno(aluno1);
        disciplinaPOO.matricularAluno(aluno2);

        disciplinaPOO.criarAvaliacao(1, "Prova Semestral");

        Avaliacao prova1 = disciplinaPOO.getListaAvaliacoes().get(0);

        prova1.adicionarQuestao(1, "Questão 1", 2);
        prova1.adicionarQuestao(2, "Questão 2", 1);
        prova1.adicionarQuestao(3, "Questão 3", 1);

        System.out.println(disciplinaPOO.toString());

    }

}
