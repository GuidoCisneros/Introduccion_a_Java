package org.example.Extra_22;

import java.util.Scanner;

public class Extra_22 {
    public static void main(String[] args) {
        System.out.println("Ingrese 5 palabras");
        sopaLetras();
    }
    public static void sopaLetras(){
        Scanner read = new Scanner(System.in);
        String matrizS [][]= new String[20][20];
        int palabras= 0;
        int k = 0;
        int l = 1;
        do {
            String letras= read.next();
            int i = (int) (Math.random() * (19-0));
            if (matrizS[i][0] != null){
                i = (int) (Math.random() * (19-0));
            }
            for (int j= 0; j <= 19; j++){
                matrizS[i][j] = (letras.substring(k,l));
                k++;
                l++;
                if (l > letras.length()){
                    k = 0;
                    l = 1;
                    break;
                }
            }
            palabras++;
        }while (palabras < 5);
        llenarSopa(matrizS);
    }

    public static void llenarSopa(String[][] matrizS){
        for (int i = 0; i <= 19; i++){
            for (int j= 0; j <= 19; j++){
                if (matrizS[i][j] == null){
                    matrizS[i][j] = Integer.toString((int) (Math.random() * (9-0)));
                }
            }
        }
        imprimirSopa(matrizS);
    }
    public static void imprimirSopa(String[][] matrizS){
        for (int i = 0; i <= 19; i++){
            for (int j= 0; j <= 19; j++){
                System.out.print(matrizS[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
