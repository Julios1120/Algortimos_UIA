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
public class Inscripcion {
    private Materia materia;
    private Grupo grupo;
    private Salon salon;
    private int id_num_cuenta_alumno;
    private int d_fecha;
    private int id_num_cuenta_profesor;
    
    public Inscripcion(){
        
    }
    
    public Inscripcion(Materia materia, Grupo grupo, Salon salon, int id_num_cuenta_alumno, int d_fecha, int id_num_cuenta_profesor){
        this.materia = materia;
        this.grupo = grupo;
        this.salon = salon;
        this.id_num_cuenta_alumno = id_num_cuenta_alumno;
        this.d_fecha = d_fecha;
        this.id_num_cuenta_profesor = id_num_cuenta_profesor;
    }

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * @return the grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the salon
     */
    public Salon getSalon() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    /**
     * @return the id_num_cuenta_alumno
     */
    public int getId_num_cuenta_alumno() {
        return id_num_cuenta_alumno;
    }

    /**
     * @param id_num_cuenta_alumno the id_num_cuenta_alumno to set
     */
    public void setId_num_cuenta_alumno(int id_num_cuenta_alumno) {
        this.id_num_cuenta_alumno = id_num_cuenta_alumno;
    }

    /**
     * @return the d_fecha
     */
    public int getD_fecha() {
        return d_fecha;
    }

    /**
     * @param d_fecha the d_fecha to set
     */
    public void setD_fecha(int d_fecha) {
        this.d_fecha = d_fecha;
    }

    /**
     * @return the id_num_cuenta_profesor
     */
    public int getId_num_cuenta_profesor() {
        return id_num_cuenta_profesor;
    }

    /**
     * @param id_num_cuenta_profesor the id_num_cuenta_profesor to set
     */
    public void setId_num_cuenta_profesor(int id_num_cuenta_profesor) {
        this.id_num_cuenta_profesor = id_num_cuenta_profesor;
    }
    
}
