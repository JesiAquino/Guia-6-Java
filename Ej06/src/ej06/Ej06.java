/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06;

import java.util.Scanner;

/**
 * Crear un programa que dado un numero determine si es par o impar.
 * @author Jesica
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = scanner.nextInt();
        if(num % 2== 0 ){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");
        }
    }
    
}
