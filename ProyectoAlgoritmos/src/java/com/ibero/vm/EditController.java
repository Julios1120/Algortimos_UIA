/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.Usuario;
import com.ibero.dao.UsuarioData;
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
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 *
 * @author Samuelk.b.hc
 */
public class EditController extends SelectorComposer<Component>{
   private static final long serialVersionUID = 1L;
 
    private UsuarioData registroData = new UsuarioData();
    private Usuario registro = new Usuario();
    @Wire
    private Window win;
    @Wire
    private Textbox nameBox;
    @Wire
    private Textbox ApPBox;
    @Wire
    private Textbox ApMBox;
    @Wire
    private Textbox DirBox;
    @Wire
    private Radiogroup genderRadio;
    @Wire
    private Textbox CPBox;
    @Wire
    private Radiogroup tipoUsrRadio;
    
    public Usuario getUsuario() {
        return getRegistro();
    }
 
    @Listen("onClick = #submitButton")
    public void click() {
       
        showNotify("Changed to: " + registro.getS_nombre() , nameBox);
        SqlSession sessionSQL = null;
        try{
            String configuracion = "com/ibero/rec/db/ConfigurationIbatis.xml";
            Reader reader = Resources.getResourceAsReader(configuracion);
            sessionSQL = new SqlSessionFactoryBuilder().build(reader).openSession();
            sessionSQL.insert("com.ibero.space.usuarioMaper.insertUser",registro);
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
        getRegistro().setS_nombre(name);
 
        showNotify("Changed to: " + name, nameBox);
    }
    
    @Listen("onChange = #ApPBox")
    public void changeApP() {
        String ApP = ApPBox.getValue();
        getRegistro().setS_ap_Paterno(ApP);
 
        showNotify("Changed to: " + ApP, ApPBox);
    }
    
    @Listen("onChange = #ApMBox")
    public void changeApM() {
        String ApM = ApMBox.getValue();
        getRegistro().setS_ap_Materno(ApM);
 
        showNotify("Changed to: " + ApM, ApMBox);
    }
    
    @Listen("onChange = #DirBox")
    public void changeDir() {
        String Dir = DirBox.getValue();
        getRegistro().setS_direccion(Dir);
 
        showNotify("Changed to: " + Dir, DirBox);
    }
    
    @Listen("onChange = #CPBox")
    public void changeCP() {
        String CP = CPBox.getValue();
        int codpost = 0;
        codpost = Integer.parseInt(CP);
        registro.setId_cp(codpost);
 
        showNotify("Changed to: " + CP, CPBox);
    }
    
    private void showNotify(String msg, Component ref) {
        Clients.showNotification(msg, "info", ref, "end_center", 2000);
    }

    public Usuario getRegistro() {
        return registro;
    }

    public void setRegistro(Usuario registro) {
        this.registro = registro;
    }
    public UsuarioData getRegistroData() {
        return registroData;
    }

    public void setRegistroData(UsuarioData registroData) {
        this.registroData = registroData;
    }
    
    @Command
    public void guardar(){
        System.out.println("hola"); 
        System.out.println("1" + registro.getS_nombre() );
        System.out.println("1" + registro.getS_ap_Paterno() );
        System.out.println("1" + registro.getS_ap_Materno() );
        System.out.println("1" + registro.getS_direccion() );
    }
}
