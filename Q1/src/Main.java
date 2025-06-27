public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos", "2025001");
        a1.cadastrarNota(8.0);
        a1.cadastrarNota(7.5);

        Aluno a2 = new Aluno("Ana", "2025002");
        a2.cadastrarNota(5.0);
        a2.cadastrarNota(6.0);

        Aluno a3 = new Aluno("João", "2025003");
        a3.cadastrarNota(9.0);
        a3.cadastrarNota(8.5);
        a3.cadastrarNota(7.0);

        Turma turma = new Turma();
        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAprovados();
        System.out.println();
        turma.listarReprovados();
    }
}
