/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.c_grupo;
import com.ibero.julio.dao.c_grupodata;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Julio Cesar
 */
public class c_grupoViewModel {
    private c_grupodata grupoData = new c_grupodata();
    private List<c_grupo> grupos = null;
    
    @Init
    public void init(){
        setGrupos(grupoData.getAllGrupoDB());
    }
    
       
    public List<c_grupo>getGrupo(){
        return grupos;
    }
    public void setGrupos(List<c_grupo> grupos) {
        this.grupos = grupos;
    }
}
