/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Jesica
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese grados en centígrados");
        Double c= scanner.nextDouble();
        Double f= 32 + (9*c/5);
        System.out.println("==============================");
        System.out.println("Es equivalente a " +f +"°f");
        
    }
    
}
