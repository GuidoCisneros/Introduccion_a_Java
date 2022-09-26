package org.example.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int numero2 = read.nextInt();
        System.out.print("La sumatoria es: "+(read.nextInt() + numero2));
    }
}