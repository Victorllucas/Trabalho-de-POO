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

public class CursoDAO {

    private List<Curso> cursos = new ArrayList<>();

    // CREATE
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso adicionado com sucesso!");
    }

    // READ (por ID)
    public Curso buscarCursoPorId(int id) {
        for (Curso curso : cursos) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        System.out.println("Curso não encontrado.");
        return null; // Retorna null se não encontrar
    }

    // UPDATE
    public void atualizarCurso(int id, Curso novoCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == id) {
                novoCurso.setId(id); // Mantém o mesmo ID
                cursos.set(i, novoCurso);
                System.out.println("Curso atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Curso não encontrado para atualização.");
    }

    // DELETE
    public void removerCurso(int id) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId() == id) {
                cursos.remove(i);
                System.out.println("Curso removido com sucesso!");
                return;
            }
        }
        System.out.println("Curso não encontrado para remoção.");
    }

    // Listar todos os cursos
    public List<Curso> listarCursos() {
        return cursos; // Retorna a lista de cursos
    }
}

