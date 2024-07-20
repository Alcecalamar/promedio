/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

/**
 *
 * @author cabal
 */
import java.util.Scanner;
public class Promedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();
        
        double promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los tres números es: " + promedio);
    }

}
