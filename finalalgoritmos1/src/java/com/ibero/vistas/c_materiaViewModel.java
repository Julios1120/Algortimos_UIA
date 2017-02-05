/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.c_materia;
import com.ibero.julio.dao.c_materiadata;
import java.util.List;
import org.zkoss.bind.annotation.Init;

/**
 *
 * @author Julio Cesar
 */
public class c_materiaViewModel {
   private c_materiadata materiaData = new c_materiadata();
    private List<c_materia> materias = null;
    
    @Init
    public void init(){
        setMaterias(materiaData.getAllMateriaDB());
    }
    
    public List<c_materia>getMateria(){
        return materias;
    }
    public void setMaterias(List<c_materia> materias) {
        this.materias = materias;
    }
}
