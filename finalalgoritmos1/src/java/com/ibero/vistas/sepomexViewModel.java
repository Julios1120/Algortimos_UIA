/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.sepomex;
import com.ibero.julio.dao.sepomexdata;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Julio Cesar
 */
public class sepomexViewModel {
    private sepomexdata direcionBD = new sepomexdata();
    private List<sepomex> direciones = null;
    
    @Init 
    public void init(){
        setDireciones(direcionBD.getAllSepomexDB());
   }
    /**
     * @return the direciones
     */
    public List<sepomex> getDireciones() {
        return direciones;
    }

    /**
     * @param direciones the direciones to set
     */
    public void setDireciones(List<sepomex> direciones) {
        this.direciones = direciones;
    }
    
    
    
}
