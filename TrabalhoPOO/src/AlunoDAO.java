/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Felipe
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AlunoDAO {
    private final List<Aluno> alunos = new ArrayList<>();
    private final AtomicInteger ultimoId = new AtomicInteger(0);

    // CREATE
    public void criar(Aluno aluno) {
        aluno.setId(ultimoId.incrementAndGet());
        alunos.add(aluno);
    }

    // READ
    public Aluno buscarPorId(int id) {
        return alunos.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Aluno> listarTodos() {
        return new ArrayList<>(alunos);
    }

    // UPDATE
    public boolean atualizar(Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId() == alunoAtualizado.getId()) {
                alunos.set(i, alunoAtualizado);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deletar(int id) {
        return alunos.removeIf(a -> a.getId() == id);
    }
}
