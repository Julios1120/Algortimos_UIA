/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos1;
//instanceof
/**
 *
 * @author pumas
 */

import java.util.Random;
import java.util.Scanner;


public class Algoritmos1{	
   
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random alt = new Random();      
         int N,aux;    
         do{
            System.out.print("Numeros que quieres ordenar:");
            N = reader.nextInt();
            if(N<=0)
	    System.out.println( "Valor Invalido");
         }while(N<=0);   
            int [] x = new int[N];
           
	for (int j = 0; j < N; j++) 
	    	x[j] = alt.nextInt( 10000 );
        
	for (int d = 0; d < ( N - 1 ); d++) {
	    for (int k = 0; k < N - d - 1; k++) {
                if (x[k] > x[k+1]){
	          aux       = x[k];
	          x[k]   = x[k+1];
	          x[k+1] = aux;
	        }
	    }
	}
	 
	    System.out.println("Numeros ordenados");
	 
	for (int  h= 0; h < N; h++) 
	    System.out.println(x[h]);		
        
    }            
}
    
    