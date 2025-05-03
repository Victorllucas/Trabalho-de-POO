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

public class UsuarioDAO {

    private List<Usuario> usuarios = new ArrayList<>();

    // CREATE
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

   // READ (por ID)
   public Usuario buscarUsuarioPorId(int id){
for(usuario user

