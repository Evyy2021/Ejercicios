
/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("ingresar grados centigrados: ");
        Double centigrados=leer.nextDouble();
            Double Farenheit = 32 + (9 * centigrados / 5);
         System.out.println(centigrados+" ºC = " + Farenheit+ " ºF");
    }
    
}
