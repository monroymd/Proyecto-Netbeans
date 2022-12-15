
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Indicar el primer valor");
        int num1 = leer.nextInt();
        
        System.out.println("Indique el segundo valor");
        int num2 = leer.nextInt();
        
        if (num1 < 25) {
            System.out.println("El primer valor es menor a 25");
        } else {
            System.out.println("El primer valor NO es menor a 25");
        }
        
        if (num2<25) {
            System.out.println("El segundo valor es menor a 25");
        }else {
            System.out.println("El segundo valor NO es menor a 25");
        }
        
    }
    
}
