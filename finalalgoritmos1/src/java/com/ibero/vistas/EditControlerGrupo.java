/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;


import com.ibero.julio.dao.c_grupo;
import com.ibero.julio.dao.c_grupodata;
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

/**
 *
 * @author Julio Cesar
 */
public class EditControlerGrupo extends SelectorComposer<Component> {
    private static final long serialVersionUID = 1L;
    
    private c_grupodata RegistroData = new c_grupodata();
    private c_grupo Registro = new c_grupo();
    
    @Wire
    private Window win;
    @Wire
    private Textbox descripBox;
    
        public c_grupo getGrupo(){
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
            sessionSQL.insert("mapergrupo.insertGrupo", getRegistro());
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
    public c_grupodata getRegistroData() {
        return RegistroData;
    }

    /**
     * @param RegistroData the RegistroData to set
     */
    public void setRegistroData(c_grupodata RegistroData) {
        this.RegistroData = RegistroData;
    }

    /**
     * @param Registro the Registro to set
     */
    public void setRegistro(c_grupo Registro) {
        this.Registro = Registro;
    }

    /**
     * @return the Registro
     */
    public c_grupo getRegistro() {
        return Registro;
    }


    
}
