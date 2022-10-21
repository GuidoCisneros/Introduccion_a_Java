package org.example.Ejercicio_26;

import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        int matriz2[][] = new int [3][3];
        int count= 0;
        System.out.println("Ingrese primera matriz");
        for (int i=0; i<=2;i++){
            for (int j=0; j<=2;j++){
                matriz[i][j] = read.nextInt();
            }
        }
        System.out.println("Ingrese segunda matriz");
        for (int i=0; i<=2;i++){
            for (int j=0; j<=2;j++){
                matriz2[i][j] = read.nextInt();
            }
        }
        for (int i=0; i<=2;i++){
            for (int j=0; j<=2;j++){
                if (matriz[i][j] == (-matriz2[i][j])){
                    count++;
                }
            }
        }
        if (count == 9){
            System.out.println("Es matriz antisimetrica");
        }else{
            System.out.println("No es matriz antisimetrica");
        }

    }
}
