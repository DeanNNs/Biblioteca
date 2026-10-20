package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int escolha;
        List<Usuario> usuarios = new ArrayList<>();

        do {
            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("DIGITE 1 PARA CRIAR UM LIVRO");
            System.out.println("DIGITE 2 PARA PEGAR UM LIVRO EMPRESTADO");
            System.out.println("DIGITE 3 PARA DEVOLVER UM LIVRO");
            System.out.println("DIGITE 4 PARA VER TODOS OS LIVROS");
            System.out.println("DIGITE 5 PARA VER LIVROS DE UM DETERMINADO AUTOR");
            System.out.println("DIGITE 6 PARA REMOVER OU EDITAR A QUANTIDADE DE UM LIVRO");
            System.out.println("DIGITE 7 PARA CADASTRAR UM USUÁRIO");
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
                    if (Livro.verificarCodigo(codigoNovo)) {
                        System.out.println("Esse código já está cadastrado!");
                    } else {
                        Livro livro = new Livro(titulo, genero, autor, unidade, codigoNovo);
                        Livro.livros.add(livro);
                    }

                    break;

                case 2:

                    System.out.println("Pegar livro emprestado");
                    break;

                case 3:
                    System.out.println("Devolver livro");
                    break;

                case 4:

                    Livro.listarLivros();

                    break;

                case 5:

                    System.out.println("Digite o nome do Autor");
                    String autorEscolhido = sc.next();

                    Autor.listaAutorLivro(autorEscolhido);

                    break;

                case 6:
                    editarQuantidadeLivros(sc);
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Digite o seu Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    String cpf = sc.nextLine();

                    Usuario usuario = new Usuario(nome, cpf);
                    usuarios.add(usuario);
                    System.out.println("Usuário cadastrado. ID: " + usuario.getId());
                    break;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }

        } while (escolha >= 1 && escolha <= 7);

        sc.close();
    }

    private static void editarQuantidadeLivros(Scanner sc) {
        int opcao;
        do {
            System.out.println("ESCOLHA UMA OPÇÃO");
            System.out.println("DIGITE 1 PARA AUMENTAR A QUANTIDADE DE UM LIVRO");
            System.out.println("DIGITE 2 PARA DIMINUIR A QUANTIDADE DE UM LIVRO");
            System.out.println("!! CUIDADO A OPÇÃO 2 PODE EXCLUÍ-LO !!");
            System.out.println("DIGITE 3 PARA DEVOLVER UM LIVRO");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do livro que deseja alterar:");
                    int codigo = sc.nextInt();

                    System.out.println("Digite a quantidade que deseja adicionar:");
                    int quant = sc.nextInt();

                    Livro.AdicionarQuantidade(codigo, quant);
                    break;

                case 2:
                    System.out.println("Digite o código do livro que deseja alterar:");
                    int cod = sc.nextInt();

                    System.out.println("Digite a quantidade que deseja remover:");
                    int quan = sc.nextInt();

                    Livro.SubtrairQuantidade(cod, quan);
                    break;

                case 3:
                    System.out.println("Digite o código do livro que deseja excluir:");
                    int codig = sc.nextInt();

                    Livro.RemoverLivro(codig);
                    break;
            }
        } while (opcao >= 1 && opcao <= 3);
    }
}
