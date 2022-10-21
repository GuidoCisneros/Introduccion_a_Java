package org.example.Extra_9;

import java.util.Scanner;

public class Extra_9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese valor a dividir");
        int valor = read.nextInt();
        System.out.println("Ingrese divisor");
        int resto = read.nextInt();
        int cociente = 0;
        do {
            valor = valor - resto;
            cociente = cociente +1;
        }while (valor > resto);
        System.out.println("El residuo es " + valor + " y el cociente es " + cociente);
    }
}
