/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author guil_dev
 */
import java.util.ArrayList;

public class Repository {
    
    public class LivroRepository{
        
        ArrayList <Model.Livros> listaLivro = new ArrayList<>();
        
    
        public void salvarLivro(Model.Livros objeto){
            listaLivro.add(objeto);
        }
        public void removerLivro(Model.Livros objeto){
            listaLivro.remove(objeto);
        }
        
}
    public class UsuarioRepository{
        
        ArrayList <Model.Usuarios> listaUsuario = new ArrayList<>();
        
        public void salvarUsuario(Model.Usuarios objeto){
            listaUsuario.add(objeto);
        }
        
        public void removerUsuario(Model.Usuarios objeto){
            listaUsuario.remove(objeto);
        }
        
    }
    
}
