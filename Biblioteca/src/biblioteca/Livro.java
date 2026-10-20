package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    
    private String titulo;
    private String genero;
    private String autor;
    private int quantidade;
    private int codigo;
    
   static List<Livro> livros = new ArrayList<>();
    
    
    
    public Livro(String titulo, String genero, String autor, int quantidade, int codigo){
    this.titulo = titulo;
    this.genero = genero;
    this.autor = autor;
    this.quantidade = quantidade;    
    this.codigo = codigo;
}

    public String getLivro(){
        return this.titulo + ", " + this.genero + ", " + this.autor + ", " + this.quantidade ;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void listarLivros(){
    for (Livro livro : livros){
        System.out.println("informações do livro: " + livro.getLivro());
    }
}
    public void removerLivro(int codigo){
    livros.remove(codigo);
    }
    
    public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
    }
 
    public boolean verificarExistencia(boolean existe){
        existe = false;
        
        for (Livro livro : livros){
            
        }
    } 
    
  }
    