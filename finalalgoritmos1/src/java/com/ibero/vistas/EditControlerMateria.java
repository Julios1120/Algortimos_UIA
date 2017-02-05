/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

/**
 *
 * @author Julio Cesar
 */
import com.ibero.julio.dao.c_materia;
import com.ibero.julio.dao.c_materiadata;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class EditControlerMateria extends SelectorComposer<Component> {
    private static final long serialVersionUID = 1L;
    
    private c_materiadata RegistroData = new c_materiadata();
    private c_materia Registro = new c_materia();
    
    @Wire
    private Window win;
    @Wire
    private Textbox descripBox;
    
    public c_materia getMateria() {
        return getRegistro();
    }
    
    @Listen("onClick = #submitButton")
    public void click() {
       
        showNotify("Changed to: " + getRegistro().getDescripcion() , descripBox);
        SqlSession sessionSQL = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            sessionSQL.insert("mapermateria.insertMateria", getRegistro());
            sessionSQL.commit();
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
    }
    
    @Listen("onChange = #descripBox")
    public void changeNombre() {
        String name = descripBox.getValue();
        getRegistro().setDescripcion(name);
 
        showNotify("Changed to: " + name, descripBox);
    }
    
    private void showNotify(String msg, Component ref) {
        Clients.showNotification(msg, "info", ref, "end_center", 2000);
    }

   
    
    @Command
    public void guardar(){ 
        System.out.println("1" + getRegistro().getDescripcion());
        
        
    }

    /**
     * @return the RegistroData
     */
    public c_materiadata getRegistroData() {
        return RegistroData;
    }

    /**
     * @param RegistroData the RegistroData to set
     */
    public void setRegistroData(c_materiadata RegistroData) {
        this.RegistroData = RegistroData;
    }

    /**
     * @return the Registro
     */
    public c_materia getRegistro() {
        return Registro;
    }

    /**
     * @param Registro the Registro to set
     */
    public void setRegistro(c_materia Registro) {
        this.Registro = Registro;
    }
}
