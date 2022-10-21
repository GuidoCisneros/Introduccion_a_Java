package org.example.Extra_16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Extra_16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroAinformar = read.nextInt();
        if (calculoPrimo(numeroAinformar) > 2){
            System.out.println("No es numero primo");
        }else {
            System.out.println("Es numero primo");
        }
    }

    public static int calculoPrimo(int numeroAinformar) {
        int count=0;
        for (int i= 1 ; i <= numeroAinformar; i++ ){
            if (numeroAinformar % i == 0){
                count++;
            }
        }
        return count;
    }
}
