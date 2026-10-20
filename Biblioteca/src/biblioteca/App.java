package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        List<Livro> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int escolha;

        Usuario usuario = new Usuario(1, "", "");
        usuario.cadastrarUsuario(sc);

        do {
            System.out.println("\nESCOLHA UMA OPÇÃO");
            System.out.println("DIGITE 1 PARA CRIAR UM LIVRO");
            System.out.println("DIGITE 2 PARA PEGAR UM LIVRO EMPRESTADO");
            System.out.println("DIGITE 3 PARA DEVOLVER UM LIVRO");
            System.out.println("DIGITE 4 PARA VER OS LIVROS DE UM DETERMINADO AUTOR");
            System.out.println("DIGITE QUALQUER OUTRO NÚMERO PARA SAIR");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                      
                    System.out.println("Digite o título do livro:");
                    String titulo = sc.next();
                    System.out.println("Digite o genêro do livro:");
                    String genero = sc.next();
                    System.out.println("Digite o autor do livro:");
                    String autor = sc.next();
                    System.out.println("Digite quantas unidades do livro existem:");
                    int unidade = sc.nextInt();
                    
                    Livro livro = new Livro(titulo, genero, autor, unidade);
                    livros.add(livro);
                    
                    Livro.listarLivros();

                    break;

                case 2:
                    System.out.println("Pegar livro emprestado");
                    break;

                case 3:
                    System.out.println("Devolver livro");
                    break;

                case 4:
                    System.out.println("Ver livros de um autor");
                    break;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }

        } while (escolha >= 1 && escolha <= 4);

        sc.close();
    }
}
//List<Livro> livros = new ArrayList<>();

//System.out.println("Digite o nome do livro:");
