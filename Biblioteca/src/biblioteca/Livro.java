package biblioteca;

public class Livro {
    
    private String titulo;
    private String genero;
    private Autor autor;
    private int unidade;
    
    
    
    public Livro(String titulo, String genero, Autor autor, int unidade){
    this.titulo = titulo;
    this.genero = genero;
    this.autor = autor;
    this.unidade = unidade;    
}

    public String getLivro(){
    return titulo + genero + autor;    
        
    }
    