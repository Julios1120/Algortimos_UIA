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
public class UsuarioData {
    private List<Usuario> usuario = null;
        
    public UsuarioData(){
        usuario = getListaUsuarioDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<Usuario> getListaUsuarioDB(){
        SqlSession sessionSQL = null;
        List<Usuario> listaUsuario = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaUsuario = sessionSQL.selectList("com.ibero.space.usuarioMaper.select1");
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
    public List<Usuario> getAllUsuarioDB() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setAllUsuarioDB(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    
    
}