/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01;

import java.util.Scanner;

/**
 *
 * @author Jesica
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos números");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        
       int suma = num1 + num2;
        System.out.println("==========================");
        System.out.println("La suma de los dos números ingresados es " +suma);
    }
    
}
