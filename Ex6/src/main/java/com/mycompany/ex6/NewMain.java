/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex6;

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
        int dias, meses;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de meses: ");
        meses = teclado.nextInt();
        
        dias = meses*30;
        
        System.out.println(meses+" meses equivalem a aproximadamente "+dias+" dias.");
    }
    
}
