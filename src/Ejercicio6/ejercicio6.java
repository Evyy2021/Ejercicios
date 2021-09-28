/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
        int numero;
    
      
       
       
        System.out.println("Introduzca un número entero: ");
       
        numero = leer.nextInt();
        double raiz= Math.sqrt(numero);
        
        System.out.println("El número ingresado es: " + numero);
        
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        
        System.out.println("Triple de " + numero + " -> "+ 3*numero); 
        
        System.out.println("la raiz cuadrada del numero ingresado es:  "+raiz );
    
    }
    
}
