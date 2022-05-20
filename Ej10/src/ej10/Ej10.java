/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;

import java.util.Scanner;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
  * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *
 * @author Jesica
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresar un valor límite positivo");
        int lim= scanner.nextInt();
        int suma=0;
        while(suma <= lim){
            System.out.println("Ingrese número a sumar");
            int num= scanner.nextInt();
            suma= suma+num;
        }
        System.out.println("La suma de los números es " +suma);
    }
    
}
