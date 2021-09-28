/*
Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicio8;

import java.util.Scanner;

/*
 */
public class ejercicio8 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int numero;
       
       System.out.println("Introduzca un numero");
       numero=leer.nextInt();
       if(numero%2==0){
       System.out.println("el numero es par");
       }else
       System.out.println("el numero es impar");
       
       
       
      
    }
    
}
