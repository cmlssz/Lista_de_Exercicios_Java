/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex1;

import java.util.Scanner;

/**
 *
 * @author souza
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario;
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite seu nome: ");
    usuario = teclado.next();
    
     System.out.println("Olá " +usuario+"! Seja bem vindo");
    }
    
}
