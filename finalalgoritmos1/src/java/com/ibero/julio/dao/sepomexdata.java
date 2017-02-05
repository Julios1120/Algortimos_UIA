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
public class sepomexdata {
    private List<sepomex> direcciones = null;
        
    public sepomexdata(){
        direcciones = getListaDireccionDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<sepomex> getListaDireccionDB(){
        SqlSession sessionSQL = null;
        List<sepomex> listadirecciones = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listadirecciones = sessionSQL.selectList("mapersepomex.selectsepomex");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listadirecciones;
    }
    
    public List<sepomex> getAllSepomexDB() {
        return direcciones;
    }

   
    public void setAllSepomexDB(List<sepomex> direcciones) {
        this.direcciones=direcciones;
    }
    
}
