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
    private NodosArbol Raiz;
    

    public Arbol() {
        
        Raiz = null;
    }
    
    public void NodoRaiz(int Numero){
        if(Raiz == null)
            Raiz = new NodosArbol(Numero);
        else
           Raiz.NuevoNodo(Numero);
    }
    
    public void Imprime(){
        auxImprime(Raiz);
    }
    private void auxImprime(NodosArbol nodo){
        if(nodo == null)
            return;
        System.out.println(nodo.Numero);
        auxImprimeordenadamente(nodo.NIzq);
        auxImprimeordenadamente(nodo.NDer);
        
    }
    public void Imprimeordenadamente(){
        auxImprimeordenadamente(Raiz); 
    }
    
    private void auxImprimeordenadamente(NodosArbol nodo){
        if(nodo == null)
            return;
        auxImprimeordenadamente(nodo.NDer);
        auxImprimeordenadamente(nodo.NIzq);
        System.out.println(nodo.Numero);
        
   }
    
    
    public void ImprimeRaiz(){
        System.out.println(Raiz.Numero);
    }
    
}
