/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;

import com.ibero.dao.Grupo;
import com.ibero.dao.GrupoData;
import com.ibero.dao.Materia;
import com.ibero.dao.MateriaData;
import com.ibero.dao.Salon;
import com.ibero.dao.SalonData;
import com.ibero.dao.tipoUsuario;
import com.ibero.dao.tipoUsuarioData;
import java.util.List;

/**
 *
 * @author Samuelk.b.hc
 */
public class testing {

    public static void main(String[] args) {
        SalonData salonBd = new SalonData();
        List<Salon> salones = salonBd.getAllSalonDB();
        for (Salon s : salones) {
            System.out.println("SALON: " + s.getId_salon() + " Descripición: " + s.getS_descripcion());
        }
        MateriaData materiaBd = new MateriaData();
        List<Materia> materias = materiaBd.getAllMateriaDB();
        for (Materia m : materias) {
            System.out.println("MATERIA: " + m.getId_materia() + " Descripción: " + m.getS_descripcion());
        }
        tipoUsuarioData tipousrBd = new tipoUsuarioData();
        List<tipoUsuario> tipousuarios = tipousrBd.getAllTipoUsuarioDB();
        for (tipoUsuario tusr : tipousuarios) {
            System.out.println("TIPO DE USUARIO: " + tusr.getId_tipo_usuario() + " Descripción: " + tusr.getS_descripcion());
        }
        GrupoData grupoBd = new GrupoData();
        List<Grupo> grupos = grupoBd.getAllGrupoDB();
        for (Grupo g : grupos) {
            System.out.println("Grupo: " + g.getId_grupo() + " Descripción: " + g.getS_descripcion());
        }
    }
}
