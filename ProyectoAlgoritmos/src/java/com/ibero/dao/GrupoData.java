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
public class GrupoData {
    private List<Grupo> grupo = null;
        
    public GrupoData(){
        grupo = getListaGrupoDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<Grupo> getListaGrupoDB(){
        SqlSession sessionSQL = null;
        List<Grupo> listaGrupo = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaGrupo = sessionSQL.selectList("com.ibero.space.grupoMaper.select1");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listaGrupo;
    }
    /**
     * @return the salon
     */
    public List<Grupo> getAllGrupoDB() {
        return grupo;
    }

    /**
     * @param salon the salon to set
     */
    public void setAllGrupoDB(List<Grupo> grupo) {
        this.grupo = grupo;
    }
    
    
}