/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.
 */
package Ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String caracter = "A";

        System.out.println("Ingrese una palabra");
        palabra = leer.nextLine();
        if (palabra.substring(0, 1).equals(caracter)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }

    }

}
