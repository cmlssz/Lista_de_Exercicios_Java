/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex5;

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
        double mi, km;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a distância em km: ");
        km = teclado.nextDouble();
        
        mi = km/1.60934;
        
        System.out.println("A distância em milhas é "+mi+" mi");
    }
    
}
