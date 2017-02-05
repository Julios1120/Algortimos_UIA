/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.tipoUsuario;
import com.ibero.dao.tipoUsuarioData;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Samuelk.b.hc
 */
public class tipoUsuarioVIewModel {
    private tipoUsuarioData tipoUsuarioData = new tipoUsuarioData();
    private List<tipoUsuario> tipousuarios = null;
    
    @Init
    public void init(){
        setTipoUsuario(tipoUsuarioData.getAllTipoUsuarioDB());
    }
    
    public List<tipoUsuario>getTipoUsuario(){
        return tipousuarios;
    }
    public void setTipoUsuario(List<tipoUsuario> tipousuarios) {
        this.tipousuarios = tipousuarios;
    }
}
