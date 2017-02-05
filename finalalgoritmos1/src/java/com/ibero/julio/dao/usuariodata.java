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
public class usuariodata {
    private List<usuario> usuario = null;
        
    public usuariodata(){
        usuario = getListaUsuarioDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<usuario> getListaUsuarioDB(){
        SqlSession sessionSQL = null;
        List<usuario> listaUsuario = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaUsuario = sessionSQL.selectList("maperusuario.selectusuario");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listaUsuario;
    }
    
    public List<usuario> getAllUsuarioDB() {
        return usuario;
    }

    public void setAllUsuarioDB(List<usuario> usuario) {
        this.usuario = usuario;
    }
    
}
