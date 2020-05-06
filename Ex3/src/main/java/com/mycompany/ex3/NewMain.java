/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ex3;

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
        int a, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite um número: ");
         a = teclado.nextInt();
         
         a1 = a*1;
         a2 = a*2;
         a3 = a*3;
         a4 = a*4;
         a5 = a*5;
         a6 = a*6;
         a7 = a*7;
         a8 = a*8;
         a9 = a*9;
         a10 = a*10;
                  
         System.out.println("Tabuada do número "+a+": " +a+" X 1 = "+a1+" / "+a+" X 2 = "+a2+" / "+a+" X 3 = "+a3+" / "+a+" X 4 = "+a4+" / "+a+" X 5 = "+a5+" / "+a+" X 6 = "+a6+" / "+a+" X 7 = "+a7+" / "+a+" X 8 = "+a8+" / "+a+" X 9 = "+a9+" / "+a+" X 10 = "+a10);
         
        
        
    }
    
}
