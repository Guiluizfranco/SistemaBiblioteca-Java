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
    
    public void CadastrarLivro(){
        Scanner sc = new Scanner(System.in);
        
        
           System.out.println("Insira o titulo do livro: ");
           String Titulo = sc.nextLine();
           System.out.println("\nInsira o código do livro: ");
           int id = sc.nextInt();
           System.out.println("\nInsira o genero do livro: ");
           String Genero = sc.nextLine();
           System.out.println("Insira o autor do livro: ");
           String Autor = sc.nextLine();
           System.out.println("Insira o editor(a) do livro: ");
           String Editora = sc.nextLine();
           System.out.println("\nInsira o ano de publicação do livro: ");
           int Ano = sc.nextInt();
           
           Model.Livros Objeto = new Model().new Livros(id, Titulo, Genero, Autor, Editora, Ano);
           instancia.salvarLivro(Objeto);
           
           
            System.out.println(Objeto);
          
    }
           
    
}
