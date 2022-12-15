/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
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
