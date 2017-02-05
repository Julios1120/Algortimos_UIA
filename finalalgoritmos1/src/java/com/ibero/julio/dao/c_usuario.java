 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.julio.dao;

/**
 *
 * @author Julio Cesar
 */
public class c_usuario {
    
    private int id_tipousuario;
    private String descripcion;

    public c_usuario() {
    }

    public c_usuario(int id_tipousuario, String descripcion) {
        this.id_tipousuario = id_tipousuario;
        this.descripcion = descripcion;
    }

    /**
     * @return the id_tipousuario
     */
    public int getId_tipousuario() {
        return id_tipousuario;
    }

    /**
     * @param id_tipousuario the id_tipousuario to set
     */
    public void setId_tipousuario(int id_tipousuario) {
        this.id_tipousuario = id_tipousuario;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
