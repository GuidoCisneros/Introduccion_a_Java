package org.example.Extra_10;

import java.util.Scanner;

public class Extra_10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * (10-0));
        System.out.println("Adivine el numero (entre 0-10)");
        int respuesta;
        do {
            respuesta = read.nextInt();
            if (respuesta == numeroAleatorio){
                System.out.println("Su respuesta es correcta");
            }else {
                System.out.println("Ha fallado, vuelva a intentar");
            }
        }while(respuesta != numeroAleatorio);
    }
}
