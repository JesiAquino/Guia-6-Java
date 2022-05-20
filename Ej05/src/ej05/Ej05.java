/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author Jesica
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = scanner.nextInt();
        int doble= num*2;
        int triple= num*3;
        double raiz= Math.sqrt(num);
        System.out.println("El doble del número ingresado es " +doble);
        System.out.println("El triple del número ingresado es " +triple);
        System.out.println("La raiz cuadrada del número ingresado es " +raiz);
                
    }
    
}
