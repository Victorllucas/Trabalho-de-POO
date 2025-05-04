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

public class VidaAcademica {
    public enum Tipo {
        OBSERVACAO, EVENTO, INCIDENTE, ADVERTENCIA, MERITO
    }

    private int id;
    private Tipo tipo;
    private String descricao;
    private final LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public VidaAcademica(int id, Tipo tipo, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
        this.dataModificacao = LocalDateTime.now();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; atualizarDataModificacao(); }

    public Tipo getTipo() { return tipo; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; atualizarDataModificacao(); }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; atualizarDataModificacao(); }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public LocalDateTime getDataModificacao() { return dataModificacao; }

    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDateTime.now();
    }
}
