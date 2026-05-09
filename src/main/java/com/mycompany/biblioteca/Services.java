/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author guil_dev
 */

import java.util.*;
public class Services {
    Repository.LivroRepository instanciaLivro = new Repository(). new LivroRepository();
    Repository.UsuarioRepository instanciaUsuario = new Repository(). new UsuarioRepository();
    
    public Model.Livros CadastrarLivro(int ID, String Titulo, String Genero, String Autor, String Editora, int Ano){
           
           Model.Livros Livro = new Model().new Livros(ID, Titulo, Genero, Autor, Editora, Ano);
           instanciaLivro.salvarLivro(Livro);
           
           return Livro;
      
        }
    
    public ArrayList ListarLivros(String escolha, String input){
        Model.Livros livro;
        ArrayList <Model.Livros> listaImpressão = new ArrayList<>();
        
        switch (escolha){
            case "titulo":
             
             for(int i = 0; i < instanciaLivro.listaLivro.size(); i++){
             String valor = instanciaLivro.listaLivro.get(i).getTitulo();
             
             if(valor.equals(input)){
                 livro = instanciaLivro.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
                
             }
             
             break;
            
            case "genero":
            for(int i = 0; i < instanciaLivro.listaLivro.size(); i++){
             String valor = instanciaLivro.listaLivro.get(i).getGenero();
             
             if(valor.equals(input)){
                 livro = instanciaLivro.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
             }
            break;
            
            case "autor":
                
             for(int i = 0; i < instanciaLivro.listaLivro.size(); i++){
             String valor = instanciaLivro.listaLivro.get(i).getAutor();
             
             if(valor.equals(input)){
                 livro = instanciaLivro.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
              }
             break;
             
            case "editora":
             
             for(int i = 0; i < instanciaLivro.listaLivro.size(); i++){
             String valor = instanciaLivro.listaLivro.get(i).getEditora();
             
             if(valor.equals(input)){
                 livro = instanciaLivro.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
               }
             break;
             
            case "ano": 
                
             for(int i = 0; i < instanciaLivro.listaLivro.size(); i++){
             int valor = instanciaLivro.listaLivro.get(i).getAno();
             
             int inputInt = Integer.parseInt(input);
             
             if(valor == inputInt){
                 livro = instanciaLivro.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
             }
             
             break;
             
        }
        
        return listaImpressão;
        
    }
    
    
    public ArrayList BuscarLivros(int Codigo){
        
        ArrayList listaImpressão = new ArrayList();
        Model.Livros livro;
        
        for(int i = 0; i < instanciaLivro.listaLivro.size(); i++){
            
            int valorID = instanciaLivro.listaLivro.get(i).getID();
            
            if(valorID == Codigo){
                
                livro = instanciaLivro.listaLivro.get(i);
                listaImpressão.add(livro);
            
            }  
        }
        
          return listaImpressão;
    }
    
    public boolean DeletarUsuario(String escolha, String input){
        
        boolean validacao = false;
        
        switch(escolha){
            
            case "id":
            
            for (int i = 0; i < instanciaLivro.listaLivro.size(); i++){
            
            int valor = instanciaLivro.listaLivro.get(i).getID();
            
            String valorString = Integer.toString(valor);
            
            if(valorString.equals(input)){ 
               instanciaLivro.removerLivro(instanciaLivro.listaLivro.get(i));
               
               validacao = true;
               
            }
            
           }
        
            break;
            
            case "nome":
            
            for (int i = 0; i < instanciaLivro.listaLivro.size(); i++){
            
            String valor = instanciaLivro.listaLivro.get(i).getTitulo();
            
            if(valor.equals(input)){ 
               instanciaLivro.removerLivro(instanciaLivro.listaLivro.get(i));
               
               validacao = true;
               
            }
            
           }
            break;
            
            
    }
        
        return validacao;
        
}
    
    public Model.Usuarios CadastraUsuario(int idFuncionario, String username, String nomeCompleto, String email, String senha, String cargo){
        
        Model.Usuarios Usuario = new Model(). new Usuarios(idFuncionario, username, nomeCompleto, email, senha, cargo);
        
        instanciaUsuario.salvarUsuario(Usuario);
        
        return Usuario;
        
    }
    
    public ArrayList ListaUsuario(String escolha, String input){
        ArrayList<Model.Usuarios> listaImpressao = new ArrayList();
        
        switch(escolha){
            case "username":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            String valor = instanciaUsuario.listaUsuario.get(i).getUsername();
            
            if(valor.equals(input)){ 
               listaImpressao.add(instanciaUsuario.listaUsuario.get(i));
            }
            
           }
            break;
            
            case "nome":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            String valor = instanciaUsuario.listaUsuario.get(i).getNomeCompleto();
            
            if(valor.equals(input)){ 
               listaImpressao.add(instanciaUsuario.listaUsuario.get(i));
            }
            
           }
            break;
            
            case "email":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            String valor = instanciaUsuario.listaUsuario.get(i).getEmail();
            
            if(valor.equals(input)){ 
               listaImpressao.add(instanciaUsuario.listaUsuario.get(i));
            }
            
           }
            break;
            
            case "senha":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            String valor = instanciaUsuario.listaUsuario.get(i).getSenha();
            
            if(valor.equals(input)){ 
               listaImpressao.add(instanciaUsuario.listaUsuario.get(i));
            }
            
           }
            break;
            
            case "cargo":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            String valor = instanciaUsuario.listaUsuario.get(i).getCargo();
            
            if(valor.equals(input)){ 
               listaImpressao.add(instanciaUsuario.listaUsuario.get(i));
            }
            
           }
            break;
            
            
            
        }
        
        
        return listaImpressao;
        
    }
    
    public ArrayList BuscarUsuario(int valorID){
        
        ArrayList<Model.Usuarios> listaImpressao = new ArrayList();
        
        for(int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            int valorLista = instanciaUsuario.listaUsuario.get(i).getID();
            
            if(valorLista == valorID){
                
                listaImpressao.add(instanciaUsuario.listaUsuario.get(i));
                
            }
            
        }
         return listaImpressao;
    }
    
    public boolean DeletarLivros(String escolha, String input){
        
        boolean validacao = false;
        
        switch(escolha){
            
            case "id":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            int valor = instanciaUsuario.listaUsuario.get(i).getID();
            
            String valorString = Integer.toString(valor);
            
            if(valorString.equals(input)){ 
               instanciaUsuario.removerUsuario(instanciaUsuario.listaUsuario.get(i));
               
               validacao = true;
               
            }
            
           }
        
            break;
            
            case "titulo":
            
            for (int i = 0; i < instanciaUsuario.listaUsuario.size(); i++){
            
            String valor = instanciaUsuario.listaUsuario.get(i).getUsername();
            
            if(valor.equals(input)){ 
               instanciaUsuario.removerUsuario(instanciaUsuario.listaUsuario.get(i));
               
               validacao = true;
               
            }
            
           }
            break;
            
            
    }
        
        return validacao;
        
}
}
   



