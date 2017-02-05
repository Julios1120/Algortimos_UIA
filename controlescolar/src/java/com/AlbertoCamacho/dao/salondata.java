package com.AlbertoCamacho.dao;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class salondata {
    private List<salon> salon = null;
    
 
    public salondata(){
         salon = getListsalon();
    }
    
    
    private List<salon> getListsalon(){
        SqlSession sessionSQL = null;
        List<salon> salon = null;
        
        try{
            String configuracion = "com/mybatis/db/cgf.xml";
            InputStream inputStream = Resources.getResourceAsStream(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(inputStream).openSession();
            
            salon = sessionSQL.selectList("ibero.core.db.catalogo_salonMapper.selectsalon");
        }catch (IOException ioe) { ioe.printStackTrace(); }
        finally { 
            sessionSQL.close();
        }
    
        return salon;
    }
        
        public List<salon> getAllSalon(){
            return salon;
        }
   
    
}
