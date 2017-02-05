/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlbertoCamacho.dao;

/**
 *
 * @author jacm3
 */
public class tb_inscripcion {
    
    private int id_grupo;
    private int id_materia;
    private int id_salon;
    private int id_num_cta_p;
    private int id_num_cta_a;
    private tb_inscripcion inscripcion;
    //private date fecha;

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
     * @return the id_num_cta_p
     */
    public int getId_num_cta_p() {
        return id_num_cta_p;
    }

    /**
     * @param id_num_cta_p the id_num_cta_p to set
     */
    public void setId_num_cta_p(int id_num_cta_p) {
        this.id_num_cta_p = id_num_cta_p;
    }

    /**
     * @return the id_num_cta_a
     */
    public int getId_num_cta_a() {
        return id_num_cta_a;
    }

    /**
     * @param id_num_cta_a the id_num_cta_a to set
     */
    public void setId_num_cta_a(int id_num_cta_a) {
        this.id_num_cta_a = id_num_cta_a;
    }

    /**
     * @return the inscripcion
     */
    public tb_inscripcion getInscripcion() {
        return inscripcion;
    }

    /**
     * @param inscripcion the inscripcion to set
     */
    public void setInscripcion(tb_inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }
    
    
    
    
    
}
