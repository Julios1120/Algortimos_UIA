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
public class SalonData {
    private List<Salon> salon = null;
        
    public SalonData(){
        salon = getListaSalonDB();
    }
    
    //private SqlSession getConection() {
    //String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
    
    private List<Salon> getListaSalonDB(){
        SqlSession sessionSQL = null;
        List<Salon> listaSalon = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            listaSalon = sessionSQL.selectList("com.ibero.space.salonMaper.select1");
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
    public List<Salon> getAllSalonDB() {
        return salon;
    }

    /**
     * @param salon the salon to set
     */
    public void setAllSalonDB(List<Salon> salon) {
        this.salon = salon;
    }
    
    
}