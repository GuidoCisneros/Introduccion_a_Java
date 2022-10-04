package org.example.Ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba un valor limite");
        int valorLimite = read.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingresa numeros a sumar");
            suma = read.nextInt() + suma;
        }while (suma <= valorLimite);
        System.out.print("Ha llegado al limite");
    }
}
