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
        double a, l;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do lado do quadrado (em cm): ");
        l = teclado.nextDouble();
        
        a = Math.pow(l,2);
        
        System.out.println("A área do quadrado é "+a+" cm²");
    }
    
}
