package org.example.Ejercicio_17;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese linea de codigo RS232");
        int correctChoice = 0;
        int incorrectChoice = 0;
        String codigo;
        do {
            codigo = read.next();
            if (codigo.length() == 5 && codigo.substring(0, 1).equals("X") && codigo.substring(4, 5).equals("O")) {
                correctChoice++;
            } else {
                incorrectChoice++;
            }
        } while (!codigo.equals("&&&&&"));
        System.out.println("Numero de codigos correctos: " + correctChoice);
        System.out.println("Numero de codigos incorrectos: " + incorrectChoice);
    }
}
