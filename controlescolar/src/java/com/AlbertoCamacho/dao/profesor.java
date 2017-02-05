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
public class profesor {
    private int id_num_cuenta;
    private String nombre;
    private String  apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private profesor profesor;

    /**
     * @return the id_num_cuenta
     */
    public int getId_num_cuenta() {
        return id_num_cuenta;
    }

    /**
     * @param id_num_cuenta the id_num_cuenta to set
     */
    public void setId_num_cuenta(int id_num_cuenta) {
        this.id_num_cuenta = id_num_cuenta;
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
     * @return the profesor
     */
    public profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(profesor profesor) {
        this.profesor = profesor;
    }
}
