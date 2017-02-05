/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos2;

/**
 *
 * @author pumas
 */
public class Algoritmos2 {

    static int factorial(int numero ){//FUNCION RECURSIVA
        if(numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);           
    }
            
    public static void main(String[] args) {
        System.out.println("Factorial de 3 es: " + factorial(3));
    }
    
}
