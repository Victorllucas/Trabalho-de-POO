package TrabalhoPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MatriculaDAO {
    private final List<Matricula> matriculas = new ArrayList<>();
    private final AtomicInteger ultimoId = new AtomicInteger(0);

    // CREATE
    public void matricularAluno(Matricula matricula) {
        matricula.setId(ultimoId.incrementAndGet());
        matriculas.add(matricula);
    }

    // READ
    public List<Matricula> buscarPorTurma(int turmaId) {
        return matriculas.stream()
                .filter(m -> m.getTurmaId() == turmaId)
                .toList();
    }

    // Mover todos os alunos entre turmas
    public void transferirTurma(int turmaOrigemId, int turmaDestinoId) {
        matriculas.stream()
                .filter(m -> m.getTurmaId() == turmaOrigemId)
                .forEach(m -> m.setTurmaId(turmaDestinoId));
    }

    // DELETE
    public boolean removerMatricula(int id) {
        return matriculas.removeIf(m -> m.getId() == id);
    }
}
