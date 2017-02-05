/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class Alumno {
    private int Ncuenta;
    private String Nombre;
    private String Direccion;
    private String FechaN;

    public Alumno(int Ncuenta, String Nombre, String Direccion, String FechaN) {
        this.Ncuenta = Ncuenta;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaN = FechaN;

    }

    public Alumno() {
    }

    public void setNcuenta(int Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public int getNcuenta() {
        return Ncuenta;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setFechaN(String FechaN) {
        this.FechaN = FechaN;
    }

    public String getFechaN() {
        return FechaN;
    }
}
