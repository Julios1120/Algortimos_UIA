/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vistas;

import com.ibero.julio.dao.usuario;
import com.ibero.julio.dao.usuariodata;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
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
public class EditControlerUsuario extends SelectorComposer<Component>{
   private static final long serialVersionUID = 1L;
 
    private usuariodata RegistroData = new usuariodata();
    private usuario Registro = new usuario();
    @Wire
    private Window win;
    @Wire
    private Textbox nameBox;
    @Wire
    private Textbox ApPBox;
    @Wire
    private Textbox ApMBox;
    @Wire
    private Textbox idtuserBox;
    @Wire
    private Textbox idsepoBox;
    
    public usuario getUsuario() {
        return getRegistro();
    }
    
  
    @Listen("onClick = #submitButton")
    public void click() {
       
        showNotify("Changed to: " + getRegistro().getNombre() , nameBox);
        SqlSession sessionSQL = null;
        try{
            String configuracion = "com/ibero/mybatis/db/configuration.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            sessionSQL.insert("maperusuario.insertUser", getRegistro());
            sessionSQL.commit();
         }catch(IOException e){
             e.printStackTrace();
         }
        finally{
            sessionSQL.close();
        }
    }
    
    @Listen("onChange = #nameBox")
    public void changeNombre() {
        String name = nameBox.getValue();
        getRegistro().setNombre(name);
 
        showNotify("Changed to: " + name, nameBox);
    }
    
    @Listen("onChange = #ApPBox")
    public void changeApP() {
        String ApP = ApPBox.getValue();
        getRegistro().setA_paterno(ApP);
 
        showNotify("Changed to: " + ApP, ApPBox);
    }
    
    @Listen("onChange = #ApMBox")
    public void changeApM() {
        String ApM = ApMBox.getValue();
        getRegistro().setA_materno(ApM);
 
        showNotify("Changed to: " + ApM, ApMBox);
    }
    @Listen("onChange = #idtuserBox")
    public void changeidtuserBox() {
        String iduser = idtuserBox.getValue();
        int idUser = Integer.parseInt(iduser);
        getRegistro().setId_tipousuario(idUser);
 
        showNotify("Changed to: " + iduser, idtuserBox);
    }
    @Listen("onChange = #idsepoBox")
    public void changeidsepoBox() {
        String idsepo = idsepoBox.getValue();
        int sepo=Integer.parseInt(idsepo);
        getRegistro().setId_sepomex(sepo);
 
        showNotify("Changed to: " + idsepo, idsepoBox);
    }
       
    private void showNotify(String msg, Component ref) {
        Clients.showNotification(msg, "info", ref, "end_center", 2000);
    }

   
    
    @Command
    public void guardar(){
        System.out.println("Datos del ususario"); 
        System.out.println("1" + Registro.getNombre() );
        System.out.println("1" + Registro.getA_paterno() );
        System.out.println("1" + Registro.getA_materno() );
        System.out.println("1" + Registro.getId_tipousuario());
        System.out.println("1" + Registro.getId_sepomex());
        
    }

    /**
     * @return the RegistroData
     */
    public usuariodata getRegistroData() {
        return RegistroData;
    }

    /**
     * @param RegistroData the RegistroData to set
     */
    public void setRegistroData(usuariodata RegistroData) {
        this.RegistroData = RegistroData;
    }

    /**
     * @return the Registro
     */
    public usuario getRegistro() {
        return Registro;
    }

    /**
     * @param Registro the Registro to set
     */
    public void setRegistro(usuario Registro) {
        this.Registro = Registro;
    }
    
    
}
