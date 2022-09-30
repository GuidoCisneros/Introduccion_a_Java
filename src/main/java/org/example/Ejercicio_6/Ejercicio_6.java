package org.example.Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = read.nextDouble();
        System.out.println("El doble es " + (Math.round(num)*2) + " ," + "el triple es " + (Math.round(num)*3) + " y la raiz cuadrada es " + Math.sqrt(num));
    }
}
