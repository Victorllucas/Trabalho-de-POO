/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Felipe
 */
package trabalhopoo;
import java.util.ArrayList;
import java.util.List;

public class EscolaDAO {

    private List<Escola> escolas = new ArrayList<>();

    // CREATE
    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
        System.out.println("Escola adicionada com sucesso!");
    }

    // READ (por ID)
    public Escola buscarEscolaPorId(int id) {
        for (Escola escola : escolas) {
            if (escola.getId() == id) {
                return escola;
            }
        }
        System.out.println("Escola não encontrada.");
        return null; // Retorna null se não encontrar
    }

    // UPDATE
    public void atualizarEscola(int id, Escola novaEscola) {
        for (int i = 0; i < escolas.size(); i++) {
            if (escolas.get(i).getId() == id) {
                novaEscola.setId(id); // Mantém o mesmo ID
                escolas.set(i, novaEscola);
                System.out.println("Escola atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Escola não encontrada para atualização.");
    }

    // DELETE
    public void removerEscola(int id) {
        for (int i = 0; i < escolas.size(); i++) {
            if (escolas.get(i).getId() == id) {
                escolas.remove(i);
                System.out.println("Escola removida com sucesso!");
                return;
            }
        }
        System.out.println("Escola não encontrada para remoção.");
    }

    // Listar todas as escolas
    public List<Escola> listarEscolas() {
        return escolas; // Retorna a lista de escolas
    }
}
