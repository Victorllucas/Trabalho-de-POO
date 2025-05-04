package TrabalhoPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class VidaAcademicaDAO {
    private final List<VidaAcademica> registros = new ArrayList<>();
    private final AtomicInteger ultimoId = new AtomicInteger(0);

    // CREATE
    public void criar(VidaAcademica registro) {
        registro.setId(ultimoId.incrementAndGet());
        registros.add(registro);
    }

    // READ
    public VidaAcademica buscarPorId(int id) {
        return registros.stream()
                .filter(r -> r.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<VidaAcademica> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean atualizar(VidaAcademica registroAtualizado) {
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getId() == registroAtualizado.getId()) {
                registros.set(i, registroAtualizado);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deletar(int id) {
        return registros.removeIf(r -> r.getId() == id);
    }
}
