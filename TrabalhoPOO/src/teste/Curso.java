package TrabalhoPOO;


import java.time.LocalDateTime;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */

public class Curso {
    private int id;
    private String nome;
    private String sigla;
    private String tipo; // Ex.: "superior", "integrado", "concomitante"
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    // Construtor
    public Curso(int id, String nome, String sigla, String tipo) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.tipo = tipo;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
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

