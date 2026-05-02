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
    Repository.LivroRepository instancia = new Repository(). new LivroRepository();
    
    Scanner sc = new Scanner(System.in);
    
    public Model.Livros CadastrarLivro(int ID, String Titulo, String Genero, String Autor, String Editora, int Ano){
           
           Model.Livros Livro = new Model().new Livros(ID, Titulo, Genero, Autor, Editora, Ano);
           instancia.salvarLivro(Livro);
           
           return Livro;
      
        }
    
    public ArrayList ListarLivros(String escolha, String input){
        Model.Livros livro;
        ArrayList <Model.Livros> listaImpressão = new ArrayList<>();
        
        switch (escolha){
            case "titulo":
             
             for(int i = 0; i < instancia.listaLivro.size(); i++){
             String valor = instancia.listaLivro.get(i).getTitulo();
             
             if(valor.equals(input)){
                 livro = instancia.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
                
             }
             
             break;
            
            case "genero":
            for(int i = 0; i < instancia.listaLivro.size(); i++){
             String valor = instancia.listaLivro.get(i).getGenero();
             
             if(valor.equals(input)){
                 livro = instancia.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
             }
            break;
            
            case "autor":
                
             for(int i = 0; i < instancia.listaLivro.size(); i++){
             String valor = instancia.listaLivro.get(i).getAutor();
             
             if(valor.equals(input)){
                 livro = instancia.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
              }
             break;
             
            case "editora":
             
             for(int i = 0; i < instancia.listaLivro.size(); i++){
             String valor = instancia.listaLivro.get(i).getEditora();
             
             if(valor.equals(input)){
                 livro = instancia.listaLivro.get(i);
                 
                 listaImpressão.add(livro);
                 
               }
               }
             break;
             
            case "ano": 
                
             for(int i = 0; i < instancia.listaLivro.size(); i++){
             int valor = instancia.listaLivro.get(i).getAno();
             
             int inputInt = Integer.parseInt(input);
             
             if(valor == inputInt){
                 livro = instancia.listaLivro.get(i);
                 
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
        
        for(int i = 0; i < instancia.listaLivro.size(); i++){
            
            int valorID = instancia.listaLivro.get(i).getID();
            
            if(valorID == Codigo){
                
                livro = instancia.listaLivro.get(i);
                listaImpressão.add(livro);
            
            }  
        }
        
          return listaImpressão;
    }
}
    
   



