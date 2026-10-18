package biblioteca;

public class Livro {
    
    private String titulo;
    private String genero;
    private String autor;
    private int unidade;
    
    
    
    public Livro(String titulo, String genero, String autor, int unidade){
    this.titulo = titulo;
    this.genero = genero;
    this.autor = autor;
    this.unidade = unidade;    
}

    public String getLivro(){
        return this.titulo;
    }
    
}
    