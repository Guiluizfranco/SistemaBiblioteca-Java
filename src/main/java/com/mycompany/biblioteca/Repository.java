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
}
    
}
