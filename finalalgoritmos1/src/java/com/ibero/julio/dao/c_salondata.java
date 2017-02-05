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
public class c_salondata {
    private List<c_salon> salon = null;
        
    public c_salondata(){
        salon = getListaSalonDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<c_salon> getListaSalonDB(){
        SqlSession sessionSQL = null;
        List<c_salon> listaSalon = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaSalon = sessionSQL.selectList("mapersalon.selectsalon");
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
        return listaSalon;
    }
    /**
     * @return the salon
     */
    public List<c_salon> getAllSalonDB() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setAllSalonDB(List<c_salon> salon) {
        this.salon = salon;
    }
    
}
