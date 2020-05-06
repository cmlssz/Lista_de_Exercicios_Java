/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex2;

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
        String aluno;
        int a, b, c, d, media;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite seu nome: "); 
         aluno = teclado.next();
         System.out.println("Digite a nota 1: ");
         a = teclado.nextInt();
         System.out.println("Digite a nota 2: ");
         b = teclado.nextInt();
         System.out.println("Digite a nota 3: ");
         c = teclado.nextInt();
         System.out.println("Digite a nota 4: ");
         d = teclado.nextInt();
         
         media = (a+b+c+d)/4;
         
         System.out.println("Olá "+aluno+"! sua média de matemática é: " +media);
    }
    
}
