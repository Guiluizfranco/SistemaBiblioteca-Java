/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author guil_dev
 */
import java.util.*;

public class Biblioteca {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Services service = new Services();
        boolean validacao = true;
        
        while (validacao){
            System.out.println("-----Bem vindo!-----");
            System.out.println("\nPor favor, escolha uma opção abaixo:");
            System.out.println("\n1- Gerenciar Livros");
            System.out.println("\n2- Gerenciar Usuários");
            System.out.println("\n3- Empréstimos");
            System.out.println("\n4- Sair");
            int op = sc.nextInt();
            
        switch (op){
            
            case 1:
                boolean validacaoLivro = true;
                
                while(validacaoLivro){
                  System.out.println("\n1- Cadastrar livro");
                  System.out.println("\n2- Listar livros");
                  System.out.println("\n3- Buscar livros");
                  System.out.println("\n4- Voltar");
                  int opLivro = sc.nextInt(); 
                  sc.nextLine();
                  
                  switch (opLivro){
                      
                      case 1:
                          
                          try{
                              
                          System.out.println("Insira o código (ID) do livro: ");
                          String idString = sc.nextLine();
                          
                          int id = Integer.parseInt(idString);
                          
                          System.out.println("\nInsira o titulo do livro: ");
                          String Titulo = sc.nextLine();
                          
                          System.out.println("\nInsira o genero do livro: ");
                          String Genero = sc.nextLine();
                          
                          System.out.println("\nInsira o autor do livro: ");
                          String Autor = sc.nextLine();
                          
                          System.out.println("\nInsira o editor(a) do livro: ");
                          String Editora = sc.nextLine();
                          
                          System.out.println("\nInsira o ano de publicação do livro: ");
                          String AnoString = sc.nextLine();
                          
                          int Ano = Integer.parseInt(AnoString);
                          
                         System.out.println(service.CadastrarLivro(id, Titulo, Genero, Autor, Editora, Ano));
                              
                          }catch(NumberFormatException e){
                           
                           System.out.println("Por favor, insira um valor válida");
                           
                          }
                          
                          break;
                          
                      case 2:
                          
                         System.out.println("Escolha o filtro: ");
                         System.out.println("\n| Titulo | Genero | Autor | Editora | Ano |");
                         String opListar = sc.nextLine().toLowerCase();
                         
                         switch(opListar){ 
                             
                             case "titulo":
                                 
                               System.out.println("Insira o titulo: ");
                               String valorTitulo = sc.nextLine();

                                if(service.ListarLivros(opListar, valorTitulo).isEmpty()){
                                    System.out.println("Nenhum livro encontrado");
                                }else{
                                    System.out.println(service.ListarLivros(opListar, valorTitulo)); 
                                }
                                
                                break;
                                
                             case "genero":
                                 
                               System.out.println("Insira o genero: ");
                               String valorGenero = sc.nextLine();

                                if(service.ListarLivros(opListar, valorGenero).isEmpty()){
                                    System.out.println("Nenhum livro encontrado");
                                }else{
                                    System.out.println(service.ListarLivros(opListar, valorGenero)); 
                                }
                                
                                break;
                             
                             case "autor":
                                 
                               System.out.println("Insira o autor: ");
                               String valorAutor = sc.nextLine();

                                if(service.ListarLivros(opListar, valorAutor).isEmpty()){
                                    System.out.println("Nenhum livro encontrado");
                                }else{
                                    System.out.println(service.ListarLivros(opListar, valorAutor)); 
                                }
                                
                                break;
                                
                             case "editora":
                                 
                               System.out.println("Insira o editor(a): ");
                               String valorEditora = sc.nextLine();

                                if(service.ListarLivros(opListar, valorEditora).isEmpty()){
                                    System.out.println("Nenhum livro encontrado");
                                }else{
                                    System.out.println(service.ListarLivros(opListar, valorEditora)); 
                                }
                                
                                break;
                            
                             case "ano":
                                 
                               System.out.println("Insira o ano: ");
                               String valorAno = sc.nextLine();

                                if(service.ListarLivros(opListar, valorAno).isEmpty()){
                                    System.out.println("Nenhum livro encontrado");
                                }else{
                                    System.out.println(service.ListarLivros(opListar, valorAno)); 
                                }
                                
                                break;
                                 
                                
                             default:
                                 
                                 System.out.println("Por favor, insira uma opção válida");
                                 break;
                         }
                         
                         break;
                     
                      case 3:
                          
                          System.out.println("Digite o código do livro: ");
                          int Codigo = sc.nextInt();
                          sc.nextLine();
                             
                          if(service.BuscarLivros(Codigo).isEmpty()){
                              
                            System.out.println("Nenhum livro encontrado");
                          
                          }else{
                              
                             System.out.println(service.BuscarLivros(Codigo)); 
                                
                          }
                          
                          break;
                          
                      case 4:
                          validacaoLivro = false;
                          
                          break;
                          
                      default:
                          System.out.println("Insira uma opção válida");
                          break;
                    
                  }
                  
                    
                }
                break;
            case 2:
                System.out.println("Funcionalidade em andamento");
                break;
                
            case 3:
                System.out.println("Funcionalidade em andamento");
                break;
            case 4:
                validacao = false;
                break;
                
        }  
        
    }
    }      
}
    

