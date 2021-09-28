/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package Ejercicio19;

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("ingrese los lados del cuadrado: ");
        n = leer.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= n; k++) {
                if (i == 0 || i == n - 1 || k == 0 || k == n - 1) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
        }
        System.out.println("");
    }

}
