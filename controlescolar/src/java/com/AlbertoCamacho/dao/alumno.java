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
public class alumno {
    
    private int id_alumno;
    private String nombre;
    private String  apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private alumno alumno;

    /**
     * @return the id_num_cuenta
     */
    public int getId_alumno() {
        return id_alumno;
    }

    /**
     * @param id_alumno the id_num_cuenta to set
     */
    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the alumno
     */
    public alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(alumno alumno) {
        this.alumno = alumno;
    }
    
    
    
    
    
    
}
