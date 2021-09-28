/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 */
package Ejercicio9;

import java.util.Scanner;


public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cadena1;
        String cadena2;
        
        cadena1 ="eureka";
       
        System.out.println("ingrese una frase");
         cadena2=leer.nextLine();
        if (cadena1.equals(cadena2)){
            System.out.println( "correcto");
           } else{
            System.out.println("incorrecto");
        }
        
        
        
    }
    
}
