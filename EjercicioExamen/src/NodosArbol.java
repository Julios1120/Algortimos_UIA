/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class NodosArbol {

    NodosArbol NDer;
    NodosArbol NIzq;
    int Numero;

    public NodosArbol() {
    }

    
    
    
    public NodosArbol(int Numero) {
        this.Numero = Numero;
        NIzq = NDer = null;
    }

    public void NuevoNodo(int Numero) {
        Numero = Numero / 2;
        if (Numero <= Numero) {
            if (NIzq == null) {
                NIzq = new NodosArbol(Numero);
            } else {
                NIzq.NuevoNodo(Numero);
            }
        } else if (Numero > Numero) {
            if (NDer == null) {
                NDer = new NodosArbol(Numero);
            } else {
                NDer.NuevoNodo(Numero);
            }
        }
    } 
}

