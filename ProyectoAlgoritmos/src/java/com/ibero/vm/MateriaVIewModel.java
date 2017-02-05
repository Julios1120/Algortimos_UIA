/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.Materia;
import com.ibero.dao.MateriaData;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Samuelk.b.hc
 */
public class MateriaVIewModel {
    private MateriaData materiaData = new MateriaData();
    private List<Materia> materias = null;
    
    @Init
    public void init(){
        setMaterias(materiaData.getAllMateriaDB());
    }
    
    public List<Materia>getMateria(){
        return materias;
    }
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
