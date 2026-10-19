package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    
    private String titulo;
    private String genero;
    private String autor;
    private int unidade;
    
    private List<Livro> livros = new ArrayList<>();
    
    
    
    public Livro(String titulo, String genero, String autor, int unidade){
    this.titulo = titulo;
    this.genero = genero;
    this.autor = autor;
    this.unidade = unidade;    
}

    public String getLivro(){
        return this.titulo;
    }
    
    public void listarLivros() {
    for (Livro livro : livros) {
        System.out.println("Título: " + livro.getLivro());
    }
}
    
}
    