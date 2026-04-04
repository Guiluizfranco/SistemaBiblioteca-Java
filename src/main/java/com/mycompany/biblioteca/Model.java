/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author guil_dev
 */
public class Model {
    
     class Livros{
       
       protected int ID;
       protected String titulo;
       protected String genero;
       protected String autor;
       protected String editora;
       protected int anoPublicacao;
       
       public int getID(){
           return ID;
       }
       public String getTitulo(){
           return titulo;
       }
       public String getGenero(){
           return genero;
       }
       public String getAutor(){
           return autor;
       }
       public String getEditora(){
           return editora;
       } 
       public int getAno(){
           return anoPublicacao;
       }
       
       public Livros(int ID, String titulo, String genero, String autor, String editora, int anoPublicacao){
        this.ID = ID;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
       
     
       @Override
       public String toString(){
           return "Livro{ " + ID + ", " + titulo + ", " + genero + ", " + autor + ", " + editora + ", " + anoPublicacao + " }";
       }
       
    }
    
     class Usuarios{
        
        protected int idFuncionario;
        protected String username;
        protected String nomeCompleto;
        protected String email;
        protected String senha;
        protected String cargo;
        
        public Usuarios(int idFuncionario, String username, String nomeCompleto, String email, String senha, String cargo){
            this.idFuncionario = idFuncionario;
            this.nomeCompleto = nomeCompleto;
            this.username = username;
            this.email = email;
            this.senha = senha;
            this.cargo = cargo;
        }
    }
}
