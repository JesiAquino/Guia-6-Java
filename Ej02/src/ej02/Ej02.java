/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02;

import java.util.Scanner;

/**
 *
 * @author Jesica
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Su nombre es " +nombre);
    }
    
}
