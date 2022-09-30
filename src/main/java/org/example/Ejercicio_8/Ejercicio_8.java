package org.example.Ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = read.nextInt();
        if (num % 2 == 0){
            System.out.print("Es par");
        }else {
            System.out.print("Es impar");
        }
    }
}
