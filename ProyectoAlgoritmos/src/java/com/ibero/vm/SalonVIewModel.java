/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.Salon;
import com.ibero.dao.SalonData;
import java.util.List;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Samuelk.b.hc
 */
public class SalonVIewModel {
    private SalonData salonData = new SalonData();
    private List<Salon> salones = null;
    
    @Init
    public void init(){
        setSalones(salonData.getAllSalonDB());
    }
    
    @Command
    public void guardar(){
        System.out.println("Hola");
        System.err.println("Hola" + salones.toString());
    }
    
    public List<Salon>getSalon(){
        return salones;
    }
    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }
}
