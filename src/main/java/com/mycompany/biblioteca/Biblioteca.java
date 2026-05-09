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
                  System.out.println("\n4- Deletar livros");
                  System.out.println("\n5- Voltar");
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
                          try{
                          System.out.println("Digite o código do livro: ");
                          String CodigoString = sc.nextLine();
                          
                          int Codigo = Integer.parseInt(CodigoString);
                             
                          if(service.BuscarLivros(Codigo).isEmpty()){
                              
                            System.out.println("Nenhum livro encontrado");
                          
                          }else{
                              
                             System.out.println(service.BuscarLivros(Codigo)); 
                                
                          }
                          }catch(NumberFormatException e){
                              System.out.println("Insira um valor válido");
                          }
                          break;
                      
                      case 4:
                          
                          System.out.println("Insira qual das opções deseja escolher para exclusão");
                          System.out.println("\n| ID | Titulo |");
                          String opDeletar = sc.nextLine().toLowerCase();
                          
                          switch(opDeletar){
                              
                             case "id":
                              
                              try{
                              System.out.println("Insira o código:");
                              String valorString = sc.nextLine();
                              
                              int valor = Integer.parseInt(valorString);
                              
                              boolean teste = service.DeletarUsuario(opDeletar, valorString);
                              
                              if(teste){
                                  System.out.println("Livro deletado");
                              }else{
                                  System.out.println("Livro não encontrado");
                              }
                             
                              }catch(NumberFormatException e){
                                  System.out.println("Insira uma opção válida");
                              }
                              
                              break;
                              
                             case "titulo":
                              
                              System.out.println("Insira o titulo:");
                              String valorString = sc.nextLine();
                              
                              boolean teste = service.DeletarUsuario(opDeletar, valorString);
                              
                              if(teste){
                                  System.out.println("Livro deletado");
                              }else{
                                  System.out.println("Livro não encontrado");
                              }
                              
                               break;
                               
                             default:
                                 
                                 System.out.println("Insira uma opção válida");
                                 break;
                          }
                          
                          break;
                          
                      case 5:
                          validacaoLivro = false;
                          
                          break;
                          
                      default:
                          System.out.println("Insira uma opção válida");
                          break;
                    
                  }
                  
                    
                }
                break;
            case 2:
                
                boolean validacaoUsuario = true;
                
                while(validacaoUsuario){
                  System.out.println("\n1- Cadastrar Usuario");
                  System.out.println("\n2- Listar Usuario");
                  System.out.println("\n3- Buscar Usuario");
                  System.out.println("\n4- Deletar Usuario");
                  System.out.println("\n5- Voltar");
                  int opUsuario = sc.nextInt(); 
                  sc.nextLine();
                  
                  switch (opUsuario){
                     
                      case 1:
                          try{
                          System.out.println("Insira o código (ID) do usuário: ");
                          String idString = sc.nextLine();
                          
                          int id = Integer.parseInt(idString);
                          
                          System.out.println("\nInsira o nome do usuario: ");
                          String User = sc.nextLine();
                          
                          System.out.println("\nInsira o nome completo do usuario: ");
                          String Nome = sc.nextLine();
                          
                          System.out.println("\nInsira o e-mail do usuario: ");
                          String Email = sc.nextLine();
                          
                          System.out.println("\nInsira o senha do usuario: ");
                          String Senha = sc.nextLine();
                          
                          System.out.println("\nInsira o cargo do usuario: ");
                          String Cargo = sc.nextLine();
                          
                          System.out.println(service.CadastraUsuario(id, User, Nome, Email, Senha, Cargo));
                          
                           }catch(NumberFormatException e){
                               System.out.println("Insira um código válido");
                           }
                         break; 
                      
                      case 2:
                         
                         System.out.println("Escolha o filtro: ");
                         System.out.println("\n| Username | Nome | Email | Cargo |");
                         String opListar = sc.nextLine().toLowerCase();
                         
                         switch(opListar){
                             
                             case "username":
                             System.out.println("Insira o nome de usuario: ");
                             String valorUsername = sc.nextLine(); 
                             
                             if(service.ListaUsuario(opListar, valorUsername).isEmpty()){
                             
                              System.out.println("Nenhum nome de usuario encontrado!");
                             }else{
                               System.out.println(service.ListaUsuario(opListar, valorUsername));  
                             }
                             
                              break;
                             
                             case "nome":
                             System.out.println("Insira o nome completo de usuario: ");
                             String valorNome = sc.nextLine(); 
                             
                             if(service.ListaUsuario(opListar, valorNome).isEmpty()){
                             
                              System.out.println("Nenhum usuario encontrado com esse nome!");
                             }else{
                               System.out.println(service.ListaUsuario(opListar, valorNome));  
                             }
                             
                             break;
                             
                             case "email":
                             System.out.println("Insira o e-mail usuario: ");
                             String valorEmail = sc.nextLine(); 
                             
                             if(service.ListaUsuario(opListar, valorEmail).isEmpty()){
                             
                              System.out.println("Nenhum usuario encontrado com esse e-mail!");
                             }else{
                               System.out.println(service.ListaUsuario(opListar, valorEmail));  
                             }
                             
                             break;
                             
                             case "cargo":
                             System.out.println("Insira o cargo de usuario: ");
                             String valorCargo = sc.nextLine(); 
                             
                             if(service.ListaUsuario(opListar, valorCargo).isEmpty()){
                             
                              System.out.println("Nenhum usuario encontrado com esse cargo!");
                             }else{
                               System.out.println(service.ListaUsuario(opListar, valorCargo));  
                             }
                             
                             break;
                             
                             default:
                                 
                                 System.out.println("Por favor, insira uma opção válida");
                                 break;
                             
                         }
                         
                          break;
                          
                       case 3:
                          
                           try{
                             System.out.println("\nDigite o código do usuário: ");
                             String CodigoString = sc.nextLine();
                             
                             int Codigo = Integer.parseInt(CodigoString);
                    
                             if(service.BuscarUsuario(Codigo).isEmpty()){
                        
                                 System.out.print("Nenhum usuário encontrado");
                        
                             }else{
                                 System.out.println(service.BuscarUsuario(Codigo));
                             }
                    
                    
                            }catch(NumberFormatException e){
                                System.out.println("Insira um valor válido!");
                            }
                    
                             break;
                      
                      case 4:       
                             
                          System.out.println("Insira qual das opções deseja escolher para exclusão");
                          System.out.println("\n| ID | Nome |");
                          String opDeletar = sc.nextLine().toLowerCase();
                          
                          switch(opDeletar){
                              
                             case "id":
                              
                              try{
                              System.out.println("Insira o código:");
                              String valorString = sc.nextLine();
                              
                              int valor = Integer.parseInt(valorString);
                              
                              boolean teste = service.DeletarUsuario(opDeletar, valorString);
                              
                              if(teste){
                                  System.out.println("Usuario deletado");
                              }else{
                                  System.out.println("Usuario não encontrado");
                              }
                             
                              }catch(NumberFormatException e){
                                 System.out.println("Insira uma opção válida");
                              }
                              
                              break;
                              
                             case "nome":
                              
                              
                              System.out.println("Insira o nome:");
                              String valorString = sc.nextLine();
                              
                              boolean teste = service.DeletarUsuario(opDeletar, valorString);
                              
                              if(teste){
                                  System.out.println("Usuario deletado");
                              }else{
                                  System.out.println("Usuario não encontrado");
                              }
        
                               break;
                               
                             default:
                                 
                                 System.out.println("Insira uma opção válida");
                                 break;
                          }
                          
                          break;
                          
                      case 5:
                          validacaoUsuario = false;
                           break;
                         
                      default:
                          System.out.println("Insira uma opção válida");
                          break;    
                         } 
                }
                
            case 3:
            System.out.println("Funcionalidade em andamento");
            break;
            
            case 4:
                validacao = false;
                break;
            
            default:
                System.out.println("Insira uma opção válida");
        }  
        
    }
    }      
}
    

