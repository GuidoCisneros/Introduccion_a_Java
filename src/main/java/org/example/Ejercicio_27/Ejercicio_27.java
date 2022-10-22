package org.example.Ejercicio_27;

import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int resultado;
        int matriz[][]= new int[3][3];
        for (int i=0; i<=2;i++){
            for (int j=0; j<=2;j++){
                do {
                    matriz[i][j] = read.nextInt();
                }while (matriz[i][j] >= 10);
            }
        }
        dibujarMatriz(matriz);
        sumarFilas(matriz);
        sumarColumnas(matriz);
        sumardiagonal(matriz);
        sumardiagonal2(matriz);
        resultado = sumarFilas(matriz) + sumarColumnas(matriz) + sumardiagonal(matriz) + sumardiagonal2(matriz);
        if (resultado == 8){
            System.out.println("Matriz magica");
        }else{
            System.out.println("Matriz no magica");
        }
    }

    private static int sumardiagonal2(int[][] matriz) {
        int count=0;
        int sumadiag =0;
        int j = 3-1;
        int i = 0;
        while(j>= 0){
            sumadiag = sumadiag + matriz[i][j];
            j--;
            i++;
        }
        if (sumadiag == 15){
             count++;
        }
        return count;
    }

    private static int sumardiagonal(int[][] matriz) {
        int count=0;
        int sumadiag=0;
        for (int j=0; j<=2;j++){
            for (int i=0; i<=2;i++){
                if (i == j) {
                    sumadiag = sumadiag + matriz[i][j];
                }
            }
            if (sumadiag == 15){
                count++;
            }
        }
        return count;
    }

    private static int sumarColumnas(int[][] matriz) {
        int count=0;
        for (int j=0; j<=2;j++){
            int sumacolum=0;
            for (int i=0; i<=2;i++){
                sumacolum = sumacolum + matriz[j][i];
            }
            if (sumacolum == 15){
                count++;
            }
        }
        return count;
    }

    private static int sumarFilas(int[][] matriz) {
        int count=0;
        for (int i=0; i<=2;i++){
            int sumafila=0;
            for (int j=0; j<=2;j++){
                sumafila = sumafila + matriz[i][j];
            }
            if (sumafila == 15){
                count++;
            }
        }
        return count;
    }

    private static void dibujarMatriz(int[][] matriz) {
        for (int i=0; i<=2;i++){
            for (int j=0; j<=2;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
