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
public class tipoUsuarioData {
    private List<tipoUsuario> tipousr = null;
        
    public tipoUsuarioData(){
        tipousr = getListaTipoUsuarioDB();
    }
    private List<tipoUsuario> getListaTipoUsuarioDB(){
        SqlSession sessionSQL = null;
        List<tipoUsuario> listaUsuario = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaUsuario = sessionSQL.selectList("com.ibero.space.tipousuarioMaper.select1");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listaUsuario;
    }
    /**
     * @return the salon
     */
    public List<tipoUsuario> getAllTipoUsuarioDB() {
        return tipousr;
    }

    /**
     * @param tipouList
     */
    public void setAllTipoUsuarioDB(List<tipoUsuario> tipouList) {
        this.tipousr = tipousr;
    }
    
    
}