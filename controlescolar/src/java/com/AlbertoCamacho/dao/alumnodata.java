package com.AlbertoCamacho.dao;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class alumnodata {
    private List<alumno> alumno = null;
    
 
    public alumnodata(){
         alumno = getListalumno();
    }
    
    
    private List<alumno> getListalumno(){
        SqlSession sessionSQL = null;
        List<alumno> alumno = null;
        
        try{
            String configuracion = "com/mybatis/db/cgf.xml";
            InputStream inputStream = Resources.getResourceAsStream(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(inputStream).openSession();
            
            alumno = sessionSQL.selectList("ibero.core.db.catalogo_alumnoMapper.selectalumno");
        }catch (IOException ioe) { ioe.printStackTrace(); }
        finally { 
            sessionSQL.close();
        }
    
        return alumno;
    }
        
        public List<alumno> getAllAlumno(){
            return alumno;
        }
   
    
}
