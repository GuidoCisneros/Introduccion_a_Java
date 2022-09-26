package org.example.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int numero1 = read.nextInt();
        int numero2 = read.nextInt();
        int suma = numero1 + numero2;
        System.out.print("La sumatoria es: "+suma);
    }
}