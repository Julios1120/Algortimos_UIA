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
public class Sepomex {
    private int id_cp;
    private String s_asentamiento;
    private String s_municipio;
    private String s_colonia;
    private int codigo_postal;
    
    public Sepomex(){
        
    }
    
    public Sepomex(int id_cp, String s_asentamiento, String s_municipio, String s_colonia, int codigo_postal){
        this.id_cp = id_cp;
        this.s_asentamiento = s_asentamiento;
        this.s_colonia = s_colonia;
        this.s_municipio = s_municipio;
        this.codigo_postal = codigo_postal;
    }

    /**
     * @return the id_cp
     */
    public int getId_cp() {
        return id_cp;
    }

    /**
     * @param id_cp the id_cp to set
     */
    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }

    /**
     * @return the s_asentamiento
     */
    public String getS_asentamiento() {
        return s_asentamiento;
    }

    /**
     * @param s_asentamiento the s_asentamiento to set
     */
    public void setS_asentamiento(String s_asentamiento) {
        this.s_asentamiento = s_asentamiento;
    }

    /**
     * @return the s_municipio
     */
    public String getS_municipio() {
        return s_municipio;
    }

    /**
     * @param s_municipio the s_municipio to set
     */
    public void setS_municipio(String s_municipio) {
        this.s_municipio = s_municipio;
    }

    /**
     * @return the s_colonia
     */
    public String getS_colonia() {
        return s_colonia;
    }

    /**
     * @param s_colonia the s_colonia to set
     */
    public void setS_colonia(String s_colonia) {
        this.s_colonia = s_colonia;
    }

    /**
     * @return the codigo_postal
     */
    public int getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * @param codigo_postal the codigo_postal to set
     */
    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
}
