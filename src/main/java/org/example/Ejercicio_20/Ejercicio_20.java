package org.example.Ejercicio_20;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese 4 valores");
        for (int i = 1; i<=4; i++){
            mostrarAsteriscos(read.nextInt());
        }
    }
    public static void mostrarAsteriscos(int cantidadAsteriscos){
        System.out.print(cantidadAsteriscos);
        for (int i = 1; i <= cantidadAsteriscos; i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
