public class AppTurma {
    public static void main(String[] args){
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        turma1.setTurma("CC");
        turma1.setDisciplina("POO1");

        turma2.setTurma("CC");
        turma2.setDisciplina("Calc2");
        
        turma1.exibirTurma();
        turma2.exibirTurma();
    }
}
