/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
import java.util.Scanner;
import java.util.Random;

public class MendozaChimalJulioCesar {

    
    public static void main(String[] args) {
        int Numeros;
        int Valor;
        int op;
        
        Scanner Reader = new Scanner(System.in);
      
        Random Numero = new Random();
        
        Arbol Arbol = new Arbol();
        
        do{
            System.out.println("Cuantos numeros deseas Ordenar:");
            Numeros = Reader.nextInt();
           
            if(Numeros<0)
                System.out.println(" Valor invalido ");
            
            for(int i=1;i<=Numeros;i++){
                
                //Valor = Numero.nextInt(Numeros+Numeros+1);//Genera mas numeros aleatoreos pero algunos fuera del rango del usuario
                Valor = Numero.nextInt(Numeros);
                Arbol.NodoRaiz(Valor);
            }
        
             
             System.out.println("El valor de la Raiz es:");
             Arbol.ImprimeRaiz();
             
             System.out.println("Los numeros Aleatoreos son:");
             Arbol.Imprime();
             
             System.out.println("Los numeros Ordenados son:");
             Arbol.Imprimeordenadamente();
             
             System.out.println("¿Deseas Ordenar Mas Numeros?");
             System.out.println("1=SI 2=NO");
             op = Reader.nextInt();
             
             if(op>3 || op<1)
                 System.out.println("Valor no Vlaido");
        
        }while(op==1); 
    }
    
}
