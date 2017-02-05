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
public class Usuario {
    private int id_num_cuenta;
    private String s_nombre;
    private String s_ap_Paterno;
    private String s_ap_Materno;
    private String s_direccion;
    private int id_cp;
    private tipoUsuario tipoUsuario;
    
    
    public Usuario(){
        
    }
    
    public Usuario(int id_num_cuenta, String s_nombre, String s_ap_Paterno, String s_ap_Materno, String s_direccion, int id_cp, tipoUsuario tipoUsuario){
        this.id_num_cuenta = id_num_cuenta;
        this.s_nombre = s_nombre;
        this.s_ap_Paterno = s_ap_Paterno;
        this.s_ap_Materno = s_ap_Materno;
        this.s_direccion = s_direccion;
        this.id_cp = id_cp;
        this.tipoUsuario = tipoUsuario;
        
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
     * @return the s_nombre
     */
    public String getS_nombre() {
        return s_nombre;
    }

    /**
     * @param s_nombre the s_nombre to set
     */
    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    /**
     * @return the s_ap_Paterno
     */
    public String getS_ap_Paterno() {
        return s_ap_Paterno;
    }

    /**
     * @param s_ap_Paterno the s_ap_Paterno to set
     */
    public void setS_ap_Paterno(String s_ap_Paterno) {
        this.s_ap_Paterno = s_ap_Paterno;
    }

    /**
     * @return the s_ap_Materno
     */
    public String getS_ap_Materno() {
        return s_ap_Materno;
    }

    /**
     * @param s_ap_Materno the s_ap_Materno to set
     */
    public void setS_ap_Materno(String s_ap_Materno) {
        this.s_ap_Materno = s_ap_Materno;
    }

    /**
     * @return the s_direccion
     */
    public String getS_direccion() {
        return s_direccion;
    }

    /**
     * @param s_direccion the s_direccion to set
     */
    public void setS_direccion(String s_direccion) {
        this.s_direccion = s_direccion;
    }

    /**
     * @return the tipoUsuario
     */
    public tipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(tipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getId_cp() {
        return id_cp;
    }

    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }
}

