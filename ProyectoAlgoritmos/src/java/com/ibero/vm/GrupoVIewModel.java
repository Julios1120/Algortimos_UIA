/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.Grupo;
import com.ibero.dao.GrupoData;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Samuelk.b.hc
 */
public class GrupoVIewModel {
    private GrupoData grupoData = new GrupoData();
    private List<Grupo> grupos = null;
    
    @Init
    public void init(){
        setGrupos(grupoData.getAllGrupoDB());
    }
    
       
    public List<Grupo>getGrupo(){
        return grupos;
    }
    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
