package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private static int proximoId = 1;

    private int id;
    private String nome;
    private String cpf;
    private final List<Livro> livros = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        if (id >= proximoId) {
            proximoId = id + 1;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastrarUsuario(Scanner scan) {
        System.out.println("Digite o nome do usuário:");
        this.nome = scan.nextLine();

        System.out.println("Digite o CPF do usuário:");
        this.cpf = scan.nextLine();

        this.id = proximoId++;
        System.out.println("Usuário cadastrado com ID: " + this.id);
    }

    public void guardarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getGuardarLivros() {
        return new ArrayList<>(livros);
    }
}
    


