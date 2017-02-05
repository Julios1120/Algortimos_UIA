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
public class c_grupodata {
    private List<c_grupo> grupos = null;
        
    public c_grupodata(){
        grupos = getListaGrupoDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<c_grupo> getListaGrupoDB(){
        SqlSession sessionSQL = null;
        List<c_grupo> listagrupo = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listagrupo = sessionSQL.selectList("mapergrupo.selectgrupo");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listagrupo;
    }
    /**
     * @return the salon
     */
    public List<c_grupo> getAllGrupoDB() {
        return grupos;
    }

    /**
     * @param salon the salon to set
     */
    public void setAllGrupoDB(List<c_grupo> grupos) {
        this.grupos = grupos;
    }
    
    
}
