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

public class Matricula {
    private int id;
    private int alunoId;
    private int turmaId;
    private final LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Matricula(int id, int alunoId, int turmaId) {
        this.id = id;
        this.alunoId = alunoId;
        this.turmaId = turmaId;
        this.dataCriacao = LocalDateTime.now();
        this.dataModificacao = LocalDateTime.now();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; atualizarDataModificacao(); }

    public int getAlunoId() { return alunoId; }
    public void setAlunoId(int alunoId) { this.alunoId = alunoId; atualizarDataModificacao(); }

    public int getTurmaId() { return turmaId; }
    public void setTurmaId(int turmaId) { this.turmaId = turmaId; atualizarDataModificacao(); }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public LocalDateTime getDataModificacao() { return dataModificacao; }

    private void atualizarDataModificacao() {
        this.dataModificacao = LocalDateTime.now();
    }
}
