package org.example.Ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese frase de 8 letras");
        if (read.next().length() == 8){
            System.out.print("Es correcto");
        }else {
            System.out.print("Es incorrecto");
        }
    }
}