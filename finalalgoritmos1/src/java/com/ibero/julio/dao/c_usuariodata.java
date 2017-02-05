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
public class c_usuariodata {
     private List<c_usuario> tipouser = null;
        
    public c_usuariodata(){
        tipouser = getListaTipoUsuarioDB();
    }
    private List<c_usuario> getListaTipoUsuarioDB(){
        SqlSession sessionSQL = null;
        List<c_usuario> listaUsuario = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaUsuario = sessionSQL.selectList("mapertipousuario.selectusuario");
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
    public List<c_usuario> getAllTipoUsuarioDB() {
        return tipouser;
    }

    /**
     * @param tipouList
     */
    public void setAllTipoUsuarioDB(List<c_usuario> tipouList) {
        this.tipouser = tipouList;
    }
}
