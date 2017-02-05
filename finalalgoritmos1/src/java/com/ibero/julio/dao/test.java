/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.julio.dao;

import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class test {
  
    public static void main(String[] args){
         c_salondata salonBd = new c_salondata();
        List<c_salon> salones = salonBd.getAllSalonDB();
        for(c_salon s : salones) {
            System.out.println("SALON: " + s.getId_salon() + " Descripición: " + s.getDescripcion());
        
        }
        System.out.println("Materias");
         
        c_materiadata materiaBd = new c_materiadata();
        List<c_materia> materias = materiaBd.getAllMateriaDB();
        for(c_materia s : materias) {
            System.out.println("MATERIA: " + s.getId_materia() + " Descripición: " + s.getDescripcion());
        
        }
        System.out.println("Grupos");
        
        c_grupodata grupoBd = new c_grupodata();
        List<c_grupo> grupos = grupoBd.getAllGrupoDB();
        for(c_grupo s : grupos) {
            System.out.println("GRUPOS: " + s.getId_grupo() + " Descripición: " + s.getDescripcion());
        
        }
        System.out.println("SEPOMEX");
        sepomexdata direcionesBD = new sepomexdata();
        List<sepomex> direcion = direcionesBD.getAllSepomexDB();
        for(sepomex s : direcion){
            System.out.println("Id   :"+s.getId()+"  CodigoPostal:   "+s.getCodigoPostal()+"  Estado:  "+s.getEstado()+"  Municipio:  "+s.getMunicipio()+"  Colonia:   "+s.getColonia());
        }
        
        
//        
        System.out.println("Usuarios");
        
        usuariodata usuarioBd = new usuariodata();
        List<usuario> usuarios = usuarioBd.getAllUsuarioDB();
        for(usuario s : usuarios) {
           
           System.out.println(" ID:  "+s.getId_usuario()+"  Apellido Paterno:   "+s.getA_paterno()+"   Apellido Materno:   "+s.getA_materno()+" Nombre:  "+s.getNombre());
        
        }
    }
}    
