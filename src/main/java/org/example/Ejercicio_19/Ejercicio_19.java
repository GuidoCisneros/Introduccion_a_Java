package org.example.Ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese tamaño del cuadrado");
        int cuadrado = read.nextInt();
        for (int i = 1; i <= cuadrado; i++){
            System.out.println(" ");
            for (int j = 1; j <= cuadrado; j++ ){
                if (!(i != 1 && j != 1 && cuadrado != i && cuadrado !=j)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
