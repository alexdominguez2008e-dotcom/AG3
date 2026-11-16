package dominio;

public class Libro {
    private String titulo;
    private String autor;
    private int numpaginas;
    private String isbn;

    public Libro (String titulo, String autor,int numpaginas,String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
        this.isbn = isbn;
    }

}

