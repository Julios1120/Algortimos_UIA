/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.usuario;
import com.ibero.julio.dao.usuariodata;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Julio Cesar
 */
public class usuarioViewModel {
    
    private usuariodata usuariodata = new usuariodata();
    private List<usuario> usuarios = null;
    
    @Init
    public void init(){
        setUsuarios(usuariodata.getAllUsuarioDB());
    }

    /**
     * @return the usuarios
     */
    public List<usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
}
