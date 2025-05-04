package TrabalhoPOO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluno {
    private int id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String telefone;
    private String email;
    private final LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Aluno(int id, String cpf, String nome, LocalDate nascimento, String telefone, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
        this.dataCriacao = LocalDateTime.now();
        this.dataModificacao = LocalDateTime.now();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; atualizarDataModificacao(); }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; atualizarDataModificacao(); }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; atualizarDataModificacao(); }

    public LocalDate getNascimento() { return nascimento; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; atualizarDataModificacao(); }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; atualizarDataModificacao(); }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; atualizarDataModificacao(); }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public LocalDateTime getDataModificacao() { return dataModificacao; }

    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDateTime.now();
    }
}
