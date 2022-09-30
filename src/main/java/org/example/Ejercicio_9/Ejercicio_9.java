package org.example.Ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese frase");
        if (read.next().equals("eureka")){
            System.out.print("Es correcto");
        }else {
            System.out.print("Es Incorrecto");
        }
    }
}
