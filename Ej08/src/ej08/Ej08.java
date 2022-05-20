/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        System.out.println("Devuelve correcto o incorrecto dependiendo si la palabra o frase ingresadda es de longitud 8");
        System.out.println("Ingrese frase");
        String frase= scanner.nextLine();
        int l= frase.length();
        if(l == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
