/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.masa_corporal;

/**
 *
 * @author cabal
 */
import java.util.Scanner;
public class Masa_corporal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su peso en kilogramos:");
        double peso = scanner.nextDouble();
        
        System.out.println("Ingrese su altura en metros:");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);
    }
}



