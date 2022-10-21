package org.example.Ejercicio_25;

public class Ejercicio_25 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        for (int i = 0; i <= 3; i++){
            for (int j= 0; j <= 3; j++){
                matriz[i][j]= (int) (Math.random() * 1000);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
