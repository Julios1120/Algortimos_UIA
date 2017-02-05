/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.c_usuario;
import com.ibero.julio.dao.c_usuariodata;
import java.util.List;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Julio Cesar
 */
public class c_usuarioViewModel {
    private c_usuariodata usuarioData = new c_usuariodata();
    private List<c_usuario> usuarios = null;
    
    @Init
    public void init(){
        System.out.println("Salones");
        setUsuarios(usuarioData.getAllTipoUsuarioDB());
    }
    
    @Command
    public void guardar(){
        System.out.println("Hola");
        System.err.println("Hola" + usuarios.toString());
}

    /**
     * @return the salones
     */
    public List<c_usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<c_usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
