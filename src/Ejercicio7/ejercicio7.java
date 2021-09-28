/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package Ejercicio7;

import java.util.Scanner;


public class ejercicio7 {

    
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
         int num1;
         int num2;
    
         System.out.println("ingrese el primer numero: ");
         
        num1=leer.nextInt();
        
        System.out.println("ingrese el segundo numero: ");
        
        num2= leer.nextInt();
        
        if(num1==num2){
             System.out.println("los numeros ingresados son iguales");
        }else if (num1>num2){
             
        System.out.println("el numero mayor ingresado es: "+num1);
        }else{ 
            System.out.println("el numero menor ingresado es: "+num1);
        }
            
    }
}
