/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
 */
package Ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String letraE;
        System.out.println("ingrese un número de 3 digitos");
        letraE = leer.nextLine();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    letraE = Integer.toString(i) + "-"
                            + Integer.toString(j) + "-"
                            + Integer.toString(k);
                    System.out.println(letraE.replace("3", "E"));

                }
            }
        }

    }


}
