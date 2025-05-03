/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Felipe
 */
package src;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private List<Pessoa> pessoas = new ArrayList<>();
    private int ultimoId = 0;

    // CREATE
    public void criar(Pessoa pessoa) {
        pessoa.setId(++ultimoId);
        pessoas.add(pessoa);
    }

    // READ
    public Pessoa buscarPorId(int id) {
        return pessoas.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Pessoa> listarTodos() {
        return new ArrayList<>(pessoas);
    }

    // UPDATE
    public boolean atualizar(Pessoa pessoaAtualizada) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == pessoaAtualizada.getId()) {
                pessoas.set(i, pessoaAtualizada);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deletar(int id) {
        return pessoas.removeIf(p -> p.getId() == id);
    }
}
