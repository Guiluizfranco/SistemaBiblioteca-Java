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
           return "" + ID + "" + titulo + "" + genero + "" + autor + "" + editora + "" + anoPublicacao;
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
