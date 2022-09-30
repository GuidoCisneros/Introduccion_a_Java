package org.example.Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para comparar");
        int num = read.nextInt();
        int num2 = read.nextInt();
        if (num > num2){
            System.out.println(num + " es mayor.");
        }else{
            System.out.println(num2 + " es mayor.");
        }
    }
}
