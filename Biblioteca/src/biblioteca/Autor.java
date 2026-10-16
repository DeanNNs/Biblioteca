
package biblioteca;

public class Autor {
    private String autor;
    private Livro livroAutor;
    
   public Autor(String autor, Livro livroAutor){
       this.autor = autor;
       this.livroAutor = livroAutor;
   }
   
   public String getAutor(){
        return autor;
    }
   
}
