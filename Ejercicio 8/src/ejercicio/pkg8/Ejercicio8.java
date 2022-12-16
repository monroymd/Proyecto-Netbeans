/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner (System.in);
        System.out.println("Indicar la nota a validar");
        nota = leer.nextInt();
        
        while (nota > 10 & nota < 0) {
            System.out.println("La nota es incorrecta, por favor ingresela nuevamente");
            nota = leer.nextInt();
        }
        
        if (nota <= 10 & nota >= 0) {
            System.out.println("La Nota es correcta");
        } 
    }
    
}
