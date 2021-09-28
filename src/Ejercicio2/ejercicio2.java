/*Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package Ejercicio2;

import java.util.Scanner;


public class ejercicio2 {

  
    public static void main(String[] args) {
      int numero1;
      int numero2;
      int sumatotal;
      
      
      Scanner Scanner = new Scanner(System.in);
      
        System.out.println("ingrese el primer numero: ");
        numero1=Scanner.nextInt();
        System.out.println("ingrese el segundo numero: ");
        numero2=Scanner.nextInt();
        sumatotal = numero1+ numero2;
        System.out.println("la suma de los numeros ingresados es: " +sumatotal);
        
        
        
    }
    
}
