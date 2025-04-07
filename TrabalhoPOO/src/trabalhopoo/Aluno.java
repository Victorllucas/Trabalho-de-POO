package trabalhopoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
import java.util.Date;

public class Pessoa {
    private int id;
    private String nome;
    private Date nascimento;
    private String telefone;
    private String login;
    private String senha;
    private Date dataCriacao;
    private Date dataModificacao;

    // Construtor
    public Pessoa(int id, String nome, Date nascimento, String telefone, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.dataCriacao = new Date(); // Data atual no momento da criação
        this.dataModificacao = new Date(); // Data atual no momento da modificação
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        atualizarDataModificacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        atualizarDataModificacao();
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
        atualizarDataModificacao();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        atualizarDataModificacao();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        atualizarDataModificacao();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
        atualizarDataModificacao();
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    private void atualizarDataModificacao() {
        this.dataModificacao = new Date(); // Atualiza a data de modificação para o momento atual
    }
}
