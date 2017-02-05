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
public class auto {
   String modelo;
   int anio;
   String color;
   String dueño;
   
    public auto(String modelo,int anio){
        this.modelo=modelo;
        setanio(anio);
    }
    int getanio(){
        return this.anio;
    }
    void setanio(int anio){
        this.anio = anio;
    }
    
}
