package org.example.Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.next();
        System.out.println(frase.toUpperCase() + " " + frase.toLowerCase());
    }
}
