package org.example.Ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector = new int[20];
        for (int i = 0; i < vector.length ; i++) {
            vector[i]= (int) (Math.random() * (100000-1));
        }
        compararDigitos(vector);
    }
    public static void compararDigitos(int[] vector){
        String numeroTexto;
        int undig=0;
        int dosdig=0;
        int tresdig=0;
        int cuatrodig=0;
        int cincodig=0;

        for (int i = 0; i < vector.length ; i++) {
            numeroTexto = Integer.toString(vector[i]);
            switch (numeroTexto.length()){
                case 1:
                    undig++;
                    break;
                case 2:
                    dosdig++;
                    break;
                case 3:
                    tresdig++;
                    break;
                case 4:
                    cuatrodig++;
                    break;
                case 5:
                    cincodig++;
                    break;
            }
        }
        System.out.println("El vector tiene ");
        System.out.println(undig + " cantidad de 1 digito");
        System.out.println(dosdig + " cantidad de 2 digitos");
        System.out.println(tresdig + " cantidad de 3 digitos");
        System.out.println(cuatrodig + " cantidad de 4 digitos");
        System.out.println(cincodig + " cantidad de 5 digitos");
    }
}
