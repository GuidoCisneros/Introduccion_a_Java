package org.example.Ejercicio_18;

public class Ejercicio_18 {
    public static void main(String[] args) {
        String var1;
        String var2;
        String var3;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int x = 0; x <= 9; x++) {
                    var1 = (i == 3) ? "E" : Integer.toString(i);
                    var2 = (j == 3) ? "E" : Integer.toString(j);
                    var3 = (x == 3) ? "E" : Integer.toString(x);
                    System.out.println(var1 + "-" + var2 + "-" + var3);
                }
            }
        }
    }
}
