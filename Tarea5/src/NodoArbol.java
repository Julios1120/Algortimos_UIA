/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class NodoArbol {
    NodoArbol NDer;
    NodoArbol NIzq;
    String Cadena;

    public NodoArbol(String Cadena){
        this.Cadena = Cadena;
        NIzq = NDer = null;
    }
    
    public  void NuevoNodo(String Cadena1){
        if(Cadena1.compareTo(Cadena)<0){
            if(NIzq == null)
                NIzq = new NodoArbol(Cadena1);
            else    
                NIzq.NuevoNodo(Cadena1);
        }
         
        
        else if(Cadena1.compareTo(Cadena)>0){
            if(NDer == null)
                NDer = new NodoArbol(Cadena1);
            else
                NDer.NuevoNodo(Cadena1);
        }
    } 
    
}
