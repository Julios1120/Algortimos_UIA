/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pumas
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNcuenta method, of class Alumno.
     */
    @Test
    public void testSetNcuenta() {
        System.out.println("setNcuenta");
        int Ncuenta = 0;
        Alumno instance = new Alumno();
        instance.setNcuenta(Ncuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNcuenta method, of class Alumno.
     */
    @Test
    public void testGetNcuenta() {
        System.out.println("getNcuenta");
        Alumno instance = new Alumno();
        int expResult = 0;
        int result = instance.getNcuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Alumno.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Alumno instance = new Alumno();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Alumno.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alumno instance = new Alumno();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Alumno.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String Direccion = "";
        Alumno instance = new Alumno();
        instance.setDireccion(Direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Alumno.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Alumno instance = new Alumno();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaN method, of class Alumno.
     */
    @Test
    public void testSetFechaN() {
        System.out.println("setFechaN");
        Date FechaN = null;
        Alumno instance = new Alumno();
        instance.setFechaN(FechaN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaN method, of class Alumno.
     */
    @Test
    public void testGetFechaN() {
        System.out.println("getFechaN");
        Alumno instance = new Alumno();
        Date expResult = null;
        Date result = instance.getFechaN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
