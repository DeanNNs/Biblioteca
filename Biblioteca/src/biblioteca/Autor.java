
package biblioteca;

public class Autor {
    private Livro autor;
    private Livro titulo;
    
   public Autor(Livro autor, Livro titulo){
       this.autor = autor;
       this.titulo = titulo;
   }
   
   public static void listaAutorLivro(String autorEscolhido) {
    for (Livro book : Livro.livros) {

        if (book.getAutorLivro().equalsIgnoreCase(autorEscolhido)) {

            System.out.println("Livro: " + book.getLivro());

        }
    }
}
   
   
   
}
