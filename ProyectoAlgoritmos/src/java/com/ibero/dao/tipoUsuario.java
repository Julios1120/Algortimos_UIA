
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.dao;

/**
 *
 * @author Samuelk.b.hc
 */
public class tipoUsuario {
    private int id_tipo_usuario;
    private String s_descripcion;
    
    public tipoUsuario(){
        
    }
    
    public tipoUsuario(int id_tipo_usuario, String s_descripcion){
        this.id_tipo_usuario = id_tipo_usuario;
        this.s_descripcion = s_descripcion;
    }

    /**
     * @return the id_tipo_usuario
     */
    public int getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    /**
     * @param id_tipo_usuario the id_tipo_usuario to set
     */
    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    /**
     * @return the s_descripcion
     */
    public String getS_descripcion() {
        return s_descripcion;
    }

    /**
     * @param s_descripcion the s_descripcion to set
     */
    public void setS_descripcion(String s_descripcion) {
        this.s_descripcion = s_descripcion;
    }
}
