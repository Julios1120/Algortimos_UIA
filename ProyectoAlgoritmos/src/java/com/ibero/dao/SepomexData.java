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
public class SepomexData {
    private List<Sepomex> sepomex = null;
        
    public SepomexData(){
        sepomex = getListaSepomexDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<Sepomex> getListaSepomexDB(){
        SqlSession sessionSQL = null;
        List<Sepomex> listaSepomex = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaSepomex = sessionSQL.selectList("com.ibero.space.sepomexMaper.select1");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listaSepomex;
    }
    /**
     * @return the salon
     */
    public List<Sepomex> getAllSepomexDB() {
        return sepomex;
    }

    /**
     * @param salon the salon to set
     */
    public void setAllSepomexDB(List<Sepomex> sepomex) {
        this.sepomex = sepomex;
    }
    
    
}