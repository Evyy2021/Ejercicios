/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
package Ejercicio14;

import java.util.Scanner;


public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
         
        int numero1;
        int numero2;
        int suma;
        System.out.println("ingrese un numero positivo");
                numero1=leer.nextInt();
                System.out.println("ingrese segundo numero");
                numero2=leer.nextInt();
                suma= numero1+numero2;
                
                
        
        
       
    }
    
}
