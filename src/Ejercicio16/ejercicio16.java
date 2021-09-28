/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse.
 */
package Ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("ingrese un numero");
            numero = leer.nextInt();

            if (numero == 0) {
                System.out.println("se capturo el numero 0");
                break;
            } else if (numero > 0) {
                suma = suma + numero;

            }

        }
        System.out.println("la suma de los numeros positivos ingresados es: " + suma);

    }

}
