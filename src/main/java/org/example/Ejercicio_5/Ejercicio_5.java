package org.example.Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese °C para su conversion a °F");
        System.out.println(((read.nextDouble() * 9 / 5) + 32) + "°F");
    }
}
