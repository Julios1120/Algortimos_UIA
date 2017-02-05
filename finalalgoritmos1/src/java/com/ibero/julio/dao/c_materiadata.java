/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.julio.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Julio Cesar
 */
public class c_materiadata {
    private List<c_materia> materias = null;
        
    public c_materiadata(){
        materias = getListaMateriaDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<c_materia> getListaMateriaDB(){
        SqlSession sessionSQL = null;
        List<c_materia> listamateria = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listamateria = sessionSQL.selectList("mapermateria.selectmateria");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listamateria;
    }
    /**
     * @return the salon
     */
    public List<c_materia> getAllMateriaDB() {
        return materias;
    }

   
    public void setAllMateriaDB(List<c_materia> materias) {
        this.materias = materias;
    }
    
    
}    
