package org.example.Ejercicio_21;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros");
        int euros = read.nextInt();
        System.out.println("Convertir a :");
        String cambioMoneda = read.next();
        convertirMoneda(euros, cambioMoneda);
    }
    private static void convertirMoneda(int euros, String cambioMoneda) {
        if(cambioMoneda.equals("dolares")){
            int dolares = (int) (euros *  1.28611);
            System.out.println(dolares + " $ es " + euros + " en euros");
        } else if (cambioMoneda.equals("yenes")) {
            int yenes = (int) (euros * 129.852);
            System.out.println(yenes + " yenes es " + euros + " euros");
        }else{
            int libras = (int) (euros * 0.86);
            System.out.println(libras + " libras es "+ euros + " en euros");
        }
    }
}