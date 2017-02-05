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
public class inscripcion {
    private int id_inscripcion;
    private c_materia id_materia;
    private c_salon id_salon;
    private c_grupo id_grupo;

    /**
     * @return the id_inscripcion
     */
    public int getId_inscripcion() {
        return id_inscripcion;
    }

    /**
     * @param id_inscripcion the id_inscripcion to set
     */
    public void setId_inscripcion(int id_inscripcion) {
        this.id_inscripcion = id_inscripcion;
    }

    /**
     * @return the id_materia
     */
    public c_materia getId_materia() {
        return id_materia;
    }

    /**
     * @param id_materia the id_materia to set
     */
    public void setId_materia(c_materia id_materia) {
        this.id_materia = id_materia;
    }

    /**
     * @return the id_salon
     */
    public c_salon getId_salon() {
        return id_salon;
    }

    /**
     * @param id_salon the id_salon to set
     */
    public void setId_salon(c_salon id_salon) {
        this.id_salon = id_salon;
    }

    /**
     * @return the id_grupo
     */
    public c_grupo getId_grupo() {
        return id_grupo;
    }

    /**
     * @param id_grupo the id_grupo to set
     */
    public void setId_grupo(c_grupo id_grupo) {
        this.id_grupo = id_grupo;
    }
    
    
}
