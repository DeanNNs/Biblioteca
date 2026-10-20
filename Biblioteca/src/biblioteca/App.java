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
            System.out.println("DIGITE 4 PARA VER TODOS OS LIVROS");
            System.out.println("DIGITE 5 PARA VER LIVROS DE UM DETERMINADO AUTOR");
            System.out.println("DIGITE 6 PARA REMOVER UM LIVRO");
            System.out.println("DIGITE 7 PARA EDITAR A QUANTIDADE DE UM LIVRO");
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
                    System.out.println("Digite o codigo do livro");
                    int codigoNovo = sc.nextInt();
                        if(Livro.getCodigo() == codigoNovo){
                            
                        }
                    Livro livro = new Livro(titulo, genero, autor, unidade);
                    
                    livro.livros.add(livro);
                    
                    livro.listarLivros();

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

                case 5:
                    System.out.println("Ver livros de um determinado autor");
                    break;
                    
                case 6:
                    System.out.println("Remover um livro");
                    
                    System.out.println("Digite o código do livro que deseja excluir:");
                    int codigo = sc.nextInt();
                    livro.removerLivro(codigo);
                    
                    break;
                    
                case 7:
                    System.out.println("Editar a quantidade de um livro");
                    
                    System.out.println("Digite a quantidade que deseja:");
                    int quantidade = sc.nextInt();
                    
                    livro.setQuantidade(quantidade);
                    
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
