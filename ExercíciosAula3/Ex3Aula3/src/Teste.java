public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Universidade universidade = new Universidade();
        aluno.nome = "Manu";
        aluno.curso = "CC";
        universidade.cidade = "Guarapuava";
        universidade.estado = "Paraná";
        universidade.nome = "Unicentro";
        universidade.exibeDados();
        aluno.exibeDados();
    }
}