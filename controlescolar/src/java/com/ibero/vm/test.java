/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibero.vm;


import com.AlbertoCamacho.dao.alumno;
import com.AlbertoCamacho.dao.alumnodata;
//import com.AlbertoCamacho.dao.salon;
//import com.AlbertoCamacho.dao.salondata;
import java.util.List;


/**
       
 * @author jacm3
 */
public class test {
    
    public static void main(String[] args){
        
        alumnodata alumnobd = new alumnodata();
        
        List<alumno> alumnos = alumnobd.getAllAlumno();
        for(alumno s : alumnos ){
            System.out.println("Id_alumno: "+ s.getId_alumno() + "Nombre:" + s.getNombre());
        }
    }
    
}
