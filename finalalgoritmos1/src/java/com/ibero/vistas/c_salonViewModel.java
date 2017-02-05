/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.c_salon;
import com.ibero.julio.dao.c_salondata;
import java.util.List;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Julio Cesar
 */
public class c_salonViewModel {
     private c_salondata salonData = new c_salondata();
    private List<c_salon> salones = null;
    
    @Init
    public void init(){
        System.out.println("Salones");
        setSalones(salonData.getAllSalonDB());
    }
    
    @Command
    public void guardar(){
        System.out.println("Hola");
        System.err.println("Hola" + salones.toString());
}

    /**
     * @return the salones
     */
    public List<c_salon> getSalones() {
        return salones;
    }

    /**
     * @param salones the salones to set
     */
    public void setSalones(List<c_salon> salones) {
        this.salones = salones;
    }
}
