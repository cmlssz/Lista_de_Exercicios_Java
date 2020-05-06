/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex4;

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
       double a, b, h;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite o tamanho da base do triângulo (em cm): ");
       b = teclado.nextDouble();
       System.out.println("Digite o tamanho da altura do triângulo (em cm): ");
       h = teclado.nextDouble();
       
       a = (b*h)/2;
       
        System.out.println("A área do triângulo é "+a+" cm²");
        
    }
    
}
