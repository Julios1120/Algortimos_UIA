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
public class Salon {
    private int id_salon;
    private String s_descripcion;
    
    public Salon(){
        
    }
    
    public Salon(int id_salon, String s_descripcion){
        this.id_salon = id_salon;
        this.s_descripcion = s_descripcion;
    }

    /**
     * @return the id_salon
     */
    public int getId_salon() {
        return id_salon;
    }

    /**
     * @param id_salon the id_salon to set
     */
    public void setId_salon(int id_salon) {
        this.id_salon = id_salon;
    }

    /**
     * @return the s_descripcion
     */
    public String getS_descripcion() {
        return s_descripcion;
    }

    /**
     * @param s_descripcion the s_descripion to set
     */
    public void setS_descripcion(String s_descripcion) {
        this.s_descripcion = s_descripcion;
    }
}
