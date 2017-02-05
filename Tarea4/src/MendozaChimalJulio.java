
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pumas
 */
public class MendozaChimalJulio {

    public static void main(String[] args) {
        
        Alumno alumno;
        int Ncuenta;
        String Nombre;
        String Direccion;
        String FechaN;
        Boolean encontrado = false;
        int op, Nalumnos, aux;

        ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();

        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Selecione una opcion: ");
            System.out.println("1.- Registrar Alumno: ");
            System.out.println("2.- Buscar Alumno: ");
            System.out.println("3.-Salir ");
            op = reader.nextInt();
            if (op < 0 || op > 3) {
                System.out.println("Valor no valido intentalo de nuevo ");
            }
            switch (op) {
                case 1:

                    System.out.println("Cuantos Alumnos deseas registrar: ");
                    Nalumnos = reader.nextInt();
                    if (Nalumnos < 0) {
                        System.out.println("Valor no valido intentalo de nuevo");
                    }

                    for (int i = 1; i <= Nalumnos; i++) {
                        System.out.println("Ingresa el Numero de Cuenta: ");
                        Ncuenta = reader.nextInt();
                        reader.nextLine();
                        System.out.println("Ingresa el Nombre del alumno: ");
                        Nombre = reader.nextLine();
                        System.out.println("Ingresa la Direccion del alumno: ");
                        Direccion = reader.nextLine();
                        reader.nextLine();
                        System.out.println("Ingresa la Fecha de Nacimiento: ");
                        FechaN = reader.nextLine();
                        reader.nextLine();
                        alumno = new Alumno();
                        alumno.setNcuenta(Ncuenta);
                        alumno.setNombre(Nombre);
                        alumno.setDireccion(Direccion);
                        alumno.setFechaN(FechaN);
                        Alumnos.add(alumno);
                    }
                    break;
                case 2:
                    System.out.println("Introduce el Numero de Cuenta a buscar: ");
                    Ncuenta = reader.nextInt();
                    //Busqueda(Ncuenta,Alumnos,encontrado);
                    //if(encontrado==true){
                    for (int k = 0; k < Alumnos.size(); k++) {
                        if (Alumnos.get(k).getNcuenta() == Ncuenta) {
                            System.out.println(Alumnos.get(k).getNcuenta());
                            System.out.println(Alumnos.get(k).getNombre());
                            System.out.println(Alumnos.get(k).getFechaN());
                            System.out.println(Alumnos.get(k).getDireccion());
                        }

                    }
                    break;
            }

            System.out.println("Deseas realizar mas acciones ");
            System.out.println("1=SI 2=NO");
            aux = reader.nextInt();
            if (aux < 0 || aux > 2) {
                System.out.println("Valor invalido intentalo de nuevo ");
            }
        } while (aux == 1);
    }
}

  //Busqueda(Ncuenta, Alumnos, encontrado);
//    public static Boolean Busqueda(int Ncuenta,ArrayList <Alumno> Alumnos,Boolean encontrado){
//        if (Ncuenta == Alumnos.size()) {
//            System.out.println("Numero de cuenta encontrado "+Alumnos.get(Ncuenta));
//            encontrado=true;
//            return encontrado;
//        }else{ 
//            System.out.println("Numero de cuenta no encontrado" );
//            Busqueda(Ncuenta,Alumnos,encontrado);
//            encontrado=false;
//            return encontrado;
//        }

