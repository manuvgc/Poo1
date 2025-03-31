public class Livro {
    private String autor, titulo;
    private static int contadorLivros;

    public Livro(){
        titulo = "Desconhecido";
        autor = "Anonimo";
        contadorLivros++;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        contadorLivros++;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getContador(){
        return contadorLivros;
    }
}
