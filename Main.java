/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeroprimo;

import java.util.Scanner;

/**
 *
 * @author Walter Ramos
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = entrada.nextInt();

        IPrimo numeroPrimo = new NumeroPrimo();
        boolean result = numeroPrimo.esPrimo(number);

        if (result) {
            System.out.println(number + " es un numero primo.");
        } else {
            System.out.println(number + " no es un numero primo.");
        }

        entrada.close();
    }
}
    

