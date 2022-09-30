package org.example.Ejercicio_11;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una palabra que comienze con a");
        if (read.next().substring(0, 1).equals("a")){
            System.out.print("Es correcto");
        }else {
            System.out.print("Es incorrecto");
        }
    }
}
