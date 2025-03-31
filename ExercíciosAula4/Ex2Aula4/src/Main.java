public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setAutor("Andrzej Sapkowsk");
        livro1.setTitulo("Wiedźmin");
        Livro livro2 = new Livro();
        livro2.setAutor("Neil Gaiman");
        livro2.setTitulo("Coraline");

        livro1.exibaInfo();
        livro2.exibaInfo();



    }
}