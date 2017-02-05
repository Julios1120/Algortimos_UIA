/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.Sepomex;
import com.ibero.dao.SepomexData;
import java.util.List;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Samuelk.b.hc
 */
public class SepomexVIewModel {
    private SepomexData sepomexData = new SepomexData();
    private List<Sepomex> sepomexes = null;
    
    @Init
    public void init(){
        setSepomexes(sepomexData.getAllSepomexDB());
    }
    
    @Command
    public void guardar(){
        System.out.println("Hola");
        System.err.println("Hola" + sepomexes.toString());
    }
    
    public List<Sepomex>getSepomex(){
        return sepomexes;
    }
    public void setSepomexes(List<Sepomex> sepomexes) {
        this.sepomexes = sepomexes;
    }
}
