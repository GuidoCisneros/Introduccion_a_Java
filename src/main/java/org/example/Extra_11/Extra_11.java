package org.example.Extra_11;

import java.util.Scanner;

public class Extra_11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = read.nextInt();
        int count = 0;
        do {
            numero = numero /10;
            count++;
        }while(numero > 0);
        System.out.println("El numero de digitos es " + count);
    }
}