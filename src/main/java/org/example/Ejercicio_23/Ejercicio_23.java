package org.example.Ejercicio_23;

import java.util.Scanner;

import static java.lang.Math.random;

public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int pedido = read.nextInt();
        int vector[] = new int[50];
        int count = 0;
        for (int i = 0; i <= 50; i++){
            vector[i] = (int) (Math.random() *10);
            if(vector[i] == pedido){
                System.out.println("El numero se encontro en el indice " + i);
                count++;
            }
        }
        System.out.println("El numero se ha repetido " + count + " veces");
    }
}
