/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Samuelk.b.hc
 */
public class MateriaData {
    private List<Materia> materia = null;
        
    public MateriaData(){
        materia = getListaMateriaDB();
    }
    private List<Materia> getListaMateriaDB(){
        SqlSession sessionSQL = null;
        List<Materia> listaMateria = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaMateria = sessionSQL.selectList("com.ibero.space.materiaMaper.select1");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listaMateria;
    }
    /**
     * @return the materia
     */
    public List<Materia> getAllMateriaDB() {
        return materia;
    }

    /**
     * @param materia
     */
    public void setAllMateriaDB(List<Materia> materia) {
        this.materia = materia;
    }
    
    
}