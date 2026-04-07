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
        boolean loopBreak = false;
        
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
                    
                 boolean loopBreak1 = false;
                 boolean validacao1 = true;
                 while(validacao1){
                  System.out.println("\n1- Cadastrar livro");
                  System.out.println("\n2- Listar livros");
                  System.out.println("\n3- Buscar livros");
                  System.out.println("\n4- Voltar");
                  int op1 = sc.nextInt();  
                  
                  if(op1 == 1){
                      
                      try{
                          service.CadastrarLivro();
                      }catch(NumberFormatException e){
                          System.out.println("Insira um número válido");
                      }
                    
                 }else if(op1 == 2){
                     
                     try{
                         service.ListarLivros();
                     }catch(NumberFormatException e){
                         System.out.println("Insira um número válido");
                     }
                    
                 }else if(op1 == 3){
                     
                     try{
                         service.BuscarLivros();
                     }catch(NumberFormatException e){
                         System.out.println("Insira um valor válido");
                     }
                    
                 }else if (op1 == 4){
                     loopBreak1 = true;
                     break;
                 }else{
                     System.out.println("Por favor, insira um opção válida");
                 }
                  if(loopBreak) break;
                 }
                 break;
                 
                case 2:
                    
                 boolean loopBreak2 = false;
                 boolean validacao2 = true;
                 while(validacao2){
                 System.out.println("\n1- Cadastrar usuarios");
                 System.out.println("\n2- Listar usuarios");
                 System.out.println("\n3- Buscar usuarios");
                 System.out.println("\n4- Voltar");
                 int op2 = sc.nextInt(); 
                 
                 if(op2 == 1){
                    //função cadastrar usuarios 
                 }else if(op2 == 2){
                    //função listar usuarios 
                 }else if(op == 3){
                    //função buscar usuarios 
                 }else if (op2 == 4){
                     loopBreak2 = true;
                     break;
                 }else{
                     System.out.println("Por favor, insira um opção válida");
                 }
                  if(loopBreak) break;
                 } 
                 
                 break;
                   
                case 3:
                    
                 boolean loopBreak3 = false;
                 boolean validacao3 = true;
                 while(validacao3){
                 System.out.println("\n1- Emprestar livro");
                 System.out.println("\n2- Devolver livro");
                 System.out.println("\n3- Voltar");
                 int op3 = sc.nextInt();  
                 
                 
                 if(op3 == 1){
                    //função emprestar
                 }else if(op3 == 2){
                    //função devolver 
                 }else if (op3 == 3){
                     loopBreak3 = true;
                     break;
                 }else{
                     System.out.println("Por favor, insira um opção válida");
                 }
                  if(loopBreak) break;
                 } 
                 
                 break;
                 
                case 4: 
                    
                    loopBreak = true;
                    break;
                
                default:
                    System.out.println("Por favor, insira um opção válida");
            }   
            
            if(loopBreak) break;
            
        
        
        }
        
    }
}
