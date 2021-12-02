/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeffield
 */
public class UsuarioTest {
    
    Usuario usuario;
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //Make setUp for the test here user class
        //Write a false 
        usuario = new Usuario(10, 1212021, "Jeffield", "Jeffield@gmail.com", "activo", "password", "Empleado");
    }
    
    @After
    public void tearDown() {
        usuario=null;
    }

    /**
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        //Usuario instance = new Usuario();
        int expResult = 10;
        int result = usuario.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 10;
        //Usuario instance = new Usuario();
        usuario.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumento method, of class Usuario.
     */
    @Test
    public void testGetDocumento() {
        System.out.println("getDocumento");
        //Usuario instance = new Usuario();
        int expResult = 1212021;
        int result = usuario.getDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDocumento method, of class Usuario.
     */
    @Test
    public void testSetDocumento() {
        System.out.println("setDocumento");
        int documento = 1212021;
        //Usuario instance = new Usuario();
        usuario.setDocumento(documento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        //Usuario instance = new Usuario();
        String expResult = "Jeffield";
        String result = usuario.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Jeffield";
        //Usuario instance = new Usuario();
        usuario.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Usuario.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        //Usuario instance = new Usuario();
        String expResult = "Jeffield@gmail.com";
        String result = usuario.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Usuario.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "Jeffield@gmail.com";
        //Usuario instance = new Usuario();
        usuario.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Usuario.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        //Usuario instance = new Usuario();
        String expResult = "activo";
        String result = usuario.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Usuario.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "activo";
        //Usuario instance = new Usuario();
        usuario.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        //Usuario instance = new Usuario();
        String expResult = "password";
        String result = usuario.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "password";
        //Usuario instance = new Usuario();
        usuario.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRol method, of class Usuario.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        //Usuario instance = new Usuario();
        String expResult = "Empleado";
        String result = usuario.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRol method, of class Usuario.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "Empleado";
        //Usuario instance = new Usuario();
        usuario.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
