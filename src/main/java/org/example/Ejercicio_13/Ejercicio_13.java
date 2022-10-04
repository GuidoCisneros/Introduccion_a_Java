package org.example.Ejercicio_13;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Ingrese una nota");
            nota = read.nextInt();
        }while ( nota <= 0 || nota >= 10);
        System.out.println("Es correcto");
    }
}
