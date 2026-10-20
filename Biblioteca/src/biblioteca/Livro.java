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

    public Livro(String titulo, String genero, String autor, int quantidade, int codigo) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getLivro() {
        return this.titulo + ", " + this.genero + ", " + this.autor + ", " + this.quantidade + ", " + this.codigo ;
    }

    public int getCodigo() {
        return this.codigo;
    }
    
       public String getAutorLivro(){
        return this.autor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("informações do livro: " + livro.getLivro());
        }
    }

    public static void SubtrairQuantidade(int codigo, int quant) {
        boolean encontrado = false;
        for (Livro book : livros) {
            if (book.getCodigo() == codigo) {
                encontrado = true;
                if (quant >= book.quantidade) {
                    System.out.println("Quantidade inválida!");

                } else if (quant < book.quantidade) {
                    int sub;
                    sub = book.quantidade - quant;
                    book.setQuantidade(sub);
                    System.out.println("Quantidade atualizada!");
                }
                }

            }if(encontrado = false){
                System.out.println("Código inexistente!");
            }
    }

    public static void AdicionarQuantidade(int codigo, int quant){
        boolean encontrado = false;
        
        for (Livro book : livros) {
            if (book.getCodigo() == codigo){
                encontrado = true;
                
                if (quant <= 0) {
                    System.out.println("Quantidade inválida!");

                } else {
                    int soma;
                    soma = book.quantidade + quant;
                    book.setQuantidade(soma);
                    System.out.println("Quantidade atualizada!");
                }

            }
            }if(encontrado = false){
                System.out.println("Código inexistente!");
        }

    }

    public static void RemoverLivro(int codigo){
        boolean encontrado = false;
        Livro bookCod = null;

        for (Livro book : livros) {
            if (book.codigo == codigo) {
                encontrado = true;
	book = bookCod;
	break;
}
        }
            if(encontrado == true){
            Livro.livros.remove(bookCod);
            System.out.println("O livro foi removido.");

            }
            if(encontrado == false){
                System.out.println("Código inexistente!");

	}        

    }

    public static boolean verificarCodigo(int codigoNovo) {
    for (Livro book : livros) {
        if (book.getCodigo() == codigoNovo) {
            return true;
        }
    }

    return false;
}
    
}
