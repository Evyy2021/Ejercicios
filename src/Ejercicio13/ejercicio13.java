/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;

        System.out.println("ingrese una nota entre 0 y 10");
        nota = leer.nextInt();
        while (nota >10 || nota < 0) {
            System.out.println("intentelo nuevamente");
          

        }

    }

}
