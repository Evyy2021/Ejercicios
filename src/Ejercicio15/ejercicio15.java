/*
 Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        int resta;
        int mult;
        int div;
        int operacion;
        System.out.println("ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("operaciones matemáticas a realizar:\n 1-suma\n 2-resta\n 3-multiplicación\n 4-división");
        operacion = leer.nextInt();

        switch (operacion) {

            case 1:
                suma = num1 + num2;
                System.out.println("la suma es :" + suma);
                break;

            case 2:
                resta = num1 - num2;
                System.out.println("la resta es :" + resta);
                break;
            case 3:
                mult = num1 * num2;
                System.out.println(("la multiplicación es :" + mult));
                break;
            case 4:
                div = num1 / num2;
                System.out.println("la división es :" + div);
                break;
        }
    }

}
