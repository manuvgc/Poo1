import java.sql.SQLOutput;

public class TesteLivro {
    public static void main (String[] args){

        Livro Livro1 = new Livro();

        System.out.println("Livro 1");
        System.out.println(Livro1.getAutor());  
        System.out.println(Livro1.getTitulo());
        System.out.println(Livro1.getContador());
    }
}
