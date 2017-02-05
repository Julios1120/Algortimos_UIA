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
public class Grupo {
    private int id_grupo;
    private String s_descripcion;
    
    public Grupo(){
        
    }
    public Grupo(int id_grupo, String s_descripcion){
        this.id_grupo = id_grupo;
        this.s_descripcion = s_descripcion;
    }

    /**
     * @return the id_grupo
     */
    public int getId_grupo() {
        return id_grupo;
    }

    /**
     * @param id_grupo the id_grupo to set
     */
    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
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
