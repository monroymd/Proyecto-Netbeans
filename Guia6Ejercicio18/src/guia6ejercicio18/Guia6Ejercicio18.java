<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio18;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio18 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4]; 
        int[][] matriz2 = new int[4][4];
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz [i][j] = (int) (Math.random() * 10); 
                System.out.print(matriz [i][j]);
            }System.out.println("");
        } 
        System.out.println("----------------------");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz2[i][j] = matriz[j][i];
                System.out.print(matriz2[i][j]);
            } System.out.println("");
        }
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio18;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio18 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4]; 
        int[][] matriz2 = new int[4][4];
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz [i][j] = (int) (Math.random() * 10); 
                System.out.print(matriz [i][j]);
            }System.out.println("");
        } 
        System.out.println("----------------------");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz2[i][j] = matriz[j][i];
                System.out.print(matriz2[i][j]);
            } System.out.println("");
        }
    }
    
}
>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
