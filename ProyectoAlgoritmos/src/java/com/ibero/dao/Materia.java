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
public class Materia {
    private int id_materia;
    private String s_descripcion;
    
    public Materia(){
        
    }
    
    public Materia(int id_materia, String s_descripcion){
        this.id_materia = id_materia;
        this.s_descripcion = s_descripcion;
    }

    /**
     * @return the id_materia
     */
    public int getId_materia() {
        return id_materia;
    }

    /**
     * @param id_materia the id_materia to set
     */
    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
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
