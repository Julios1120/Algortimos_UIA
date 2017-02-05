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
public class usuario {
    private int id_num_cuenta;
    private String nombre;
    private String  apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private usuario usuario;

    public usuario(){
        
    }
    
    public usuario(int id_num_cuenta, String nombre, String apellidoPaterno,String apellidoMaterno, String direccion ){
        this.id_num_cuenta = id_num_cuenta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
    }
    
    
    
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
     * @return the apeillidoPaterno
     */
    public String getApeillidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apeillidoPaterno the apeillidoPaterno to set
     */
    public void setApeillidoPaterno(String apeillidoPaterno) {
        this.apellidoPaterno = apeillidoPaterno;
    }

    /**
     * @return the apellidoMaterni
     */
    public String getApellidoMaterni() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterni the apellidoMaterni to set
     */
    public void setApellidoMaterni(String apellidoMaterni) {
        this.apellidoMaterno = apellidoMaterni;
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
     * @return the usuario
     */
    public usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }
}
    
