package TrabalhoPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class UsuarioDAO {
    private final List<Usuario> usuarios = new ArrayList<>();
    private final AtomicInteger ultimoId = new AtomicInteger(0);

    // CREATE
    public void criar(Usuario usuario) {
        usuario.setId(ultimoId.incrementAndGet());
        usuarios.add(usuario);
    }

    // READ
    public Usuario buscarPorId(int id) {
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Usuario> listarTodos() {
        return new ArrayList<>(usuarios);
    }

    // UPDATE
    public boolean atualizar(Usuario usuarioAtualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuarioAtualizado.getId()) {
                usuarios.set(i, usuarioAtualizado);
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean deletar(int id) {
        return usuarios.removeIf(u -> u.getId() == id);
    }
}
