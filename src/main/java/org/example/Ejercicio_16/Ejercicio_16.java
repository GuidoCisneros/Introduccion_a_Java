package org.example.Ejercicio_16;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        int numeroCalculo ;
        int sumadorCalculo = 0;
        for (int i = 2; i <= 20; i++) {
            numeroCalculo= read.nextInt();
            if (numeroCalculo == 0){
                System.out.println("Se capturo el cero");
                System.out.println("la sumatoria es: "+sumadorCalculo);
                break;
            } else if (numeroCalculo < 0) {
                numeroCalculo = 0;
            }
            sumadorCalculo = numeroCalculo + sumadorCalculo;
        }
    }
}