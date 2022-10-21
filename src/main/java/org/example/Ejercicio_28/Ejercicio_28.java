package org.example.Ejercicio_28;

import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        matrizComparacion(matrizEstatica(),matrizDevolucion());
    }
    private static int[][] matrizEstatica() {
        int matrizM[][] = new int[10][10];
        for (int i = 0; i <= 9; i++){
            for (int j= 0; j <= 9; j++){
                matrizM[i][j]= (int) (Math.random() * (100-1));
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        return matrizM;
    }

    private static int[][] matrizDevolucion() {
        Scanner read = new Scanner(System.in);
        int matrizP[][] = new int[3][3];
        for (int i = 0; i <= 2; i++){
            for (int j= 0; j <= 2; j++){
                matrizP[i][j] = read.nextInt();
            }
        }
        return matrizP;
    }
    private static void matrizComparacion(int[][] matrizEstatica, int[][] matrizDevolucion) {
        int k = 0;
        int l = 0;
        int count = 0;
        String indices = "";
        for (int i = 0; i <= 9; i++){
            for (int j= 0; j <= 9; j++){
                if (matrizEstatica[i][j] == matrizDevolucion[k][l]){
                    count++;
                    l++;
                    indices = Integer.toString(i) + "," + Integer.toString(j) + " - " + indices;
                }else {
                    l = 0;
                    count = 0;
                    indices = "";
                }
                if (count == 3 || count == 6){
                    k++;
                    l = 0;
                    i++;
                    j= j-3;
                }
                if (l > 2){
                    l = 0;
                }
                if (k > 2){
                    k = 0;
                }
                if (count == 9){
                    break;
                }
            }
            if (count == 9){
                break;
            }
        }
        if (count == 9){
            System.out.println("Como podemos observar nuestra submatriz P se encuentra en la matriz M en los \n" +
                    "índices: " + indices);
        }else {
            System.out.println("No hay");
        }
    }
}