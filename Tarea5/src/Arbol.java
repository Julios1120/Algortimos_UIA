/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class Arbol {
    private NodoArbol Padre;

    public Arbol() {
        Padre = null;
    }
    
    public void NodoRaiz(String Cadena){
        if(Padre == null)
            Padre = new NodoArbol(Cadena); //crea nodo raiz
        else
            Padre.NuevoNodo(Cadena); //llama al metodo NuevoNodo de la clase NodoArbol        
    }
    
    public void Busqueda(){
        auxBusqueda(Padre);
    }
    private void auxBusqueda(NodoArbol nodo)
    {
        if( nodo == null )
            return;
         
        auxBusqueda(nodo.NIzq);
        auxBusqueda(nodo.NDer);
        System.out.println(nodo.Cadena);
    }

  
}
