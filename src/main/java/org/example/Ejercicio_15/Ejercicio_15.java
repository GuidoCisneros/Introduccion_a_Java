package org.example.Ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int valor = read.nextInt();
        int valor2 = read.nextInt();
        String opcionSalida = "";
        do {
            System.out.println("Menu\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija una opcion:");
            switch (read.nextInt()){
                case 1:
                    System.out.println(valor + valor2);
                    break;
                case 2:
                    System.out.println(valor - valor2);
                    break;
                case 3:
                    System.out.println(valor * valor2);
                    break;
                case 4:
                    System.out.println(valor / valor2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcionSalida = read.next();
            }
        }while(opcionSalida.equalsIgnoreCase("n"));
    }
}
