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
    
    public void CadastrarLivro(){
        
           System.out.println("Insira o código (ID) do livro: ");
           int id = sc.nextInt();

           System.out.println("\nInsira o titulo do livro: ");
           String clear = sc.nextLine();
           String Titulo = sc.nextLine();
           
           System.out.println("\nInsira o genero do livro: ");
           String Genero = sc.nextLine();
           
           System.out.println("\nInsira o autor do livro: ");
           String Autor = sc.nextLine();
           
           System.out.println("\nInsira o editor(a) do livro: ");
           String Editora = sc.nextLine();
           
           System.out.println("\nInsira o ano de publicação do livro: ");
           int Ano = sc.nextInt();
           clear = sc.nextLine();
           
           
           
           
           Model.Livros Objeto = new Model().new Livros(id, Titulo, Genero, Autor, Editora, Ano);
           instancia.salvarLivro(Objeto);
           
           
            System.out.println(Objeto);
          
    }
    
    public void ListarLivros(){
        System.out.println("" + instancia.listaLivro); 
    }
    
    public void BuscarLivros(){
        System.out.println("Como deseja buscar o livro: ");
        System.out.println("1-Código (ID) | 2-Titulo");
        int escolha = sc.nextInt();
        
        if(escolha == 1){
            System.out.println("Digite o código do livro: ");
            int Codigo = sc.nextInt();
            boolean controle = false;
            
            for (int i = 0; i < instancia.listaLivro.size(); i++){
               
                    int getID = instancia.listaLivro.get(i).getID();
                    if (getID == Codigo){
                        System.out.println("Livro{ " + instancia.listaLivro.get(i).getID()
                                              + ", " + instancia.listaLivro.get(i).getTitulo() 
                                              + ", " + instancia.listaLivro.get(i).getGenero() 
                                              + ", " + instancia.listaLivro.get(i).getAutor() 
                                              + ", " + instancia.listaLivro.get(i).getEditora() 
                                              + ", " + instancia.listaLivro.get(i).getAno() + " }");
                         controle = true;
                    
                }
            }
            if(controle == false){
                        System.out.print("Livro não encontado!");
                    }
        }else if(escolha == 2){
            System.out.println("Digite o titulo do livro: ");
            String clear = sc.nextLine();
            String Titulo = sc.nextLine();
            boolean controle = false;
            
            for(int i = 0; i < instancia.listaLivro.size(); i++){
                
                String getTitulo = instancia.listaLivro.get(i).getTitulo();
                
                if(getTitulo.equals(Titulo)){
                    System.out.println("Livro{ " + instancia.listaLivro.get(i).getID()
                                              + ", " + instancia.listaLivro.get(i).getTitulo() 
                                              + ", " + instancia.listaLivro.get(i).getGenero() 
                                              + ", " + instancia.listaLivro.get(i).getAutor() 
                                              + ", " + instancia.listaLivro.get(i).getEditora() 
                                              + ", " + instancia.listaLivro.get(i).getAno() + " }");
                    
                    controle = true;
                }
            }
            if (controle == false){
                System.out.print("Livro não encontado!");
            }
        }
    }
    
}
