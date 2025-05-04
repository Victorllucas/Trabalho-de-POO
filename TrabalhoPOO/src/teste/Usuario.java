package TrabalhoPOO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
import java.time.LocalDateTime;

public class Usuario {
    private int id;
    private Pessoa pessoa; // Relacionamento com Pessoa
    private Escola escola; // Relacionamento com Escola
    private String tipo; // Ex.: "admin", "professor", "aluno"
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    // Construtor
    public Usuario(int id, Pessoa pessoa, Escola escola, String tipo) {
        this.id = id;
        this.pessoa = pessoa;
        this.escola = escola;
        this.tipo = tipo;
        this.dataCriacao = LocalDateTime.now(); // Data de criação
        this.dataModificacao = LocalDateTime.now(); // Data de modificação
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        atualizarDataModificacao();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        atualizarDataModificacao();
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
        atualizarDataModificacao();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
