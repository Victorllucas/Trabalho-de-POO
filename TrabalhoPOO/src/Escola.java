package trabalhopoo;
import java.time.LocalDateTime;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */



public class Escola {
    private int id;
    private String nome;
    private String cidade;
    private String telefone;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    // Construtor
    public Escola(int id, String nome, String cidade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.telefone = telefone;
        this.dataCriacao = LocalDateTime.now(); // Data e hora atual no momento da criação
        this.dataModificacao = LocalDateTime.now(); // Data e hora atual no momento da modificação
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
        atualizarDataModificacao();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        atualizarDataModificacao();
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDateTime.now(); // Atualiza a data de modificação para o momento atual
    }
}
