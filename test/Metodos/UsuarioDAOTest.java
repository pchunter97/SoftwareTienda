/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Modelos.Usuario;
import java.util.List;
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
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
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
     * Test of BuscarCliente method, of class UsuarioDAO.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("BuscarCliente");
        int documento = 0;
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = null;
        Usuario result = instance.BuscarCliente(documento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Validar method, of class UsuarioDAO.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        int documento = 0;
        String password = "";
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = null;
        Usuario result = instance.Validar(documento, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listar method, of class UsuarioDAO.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        UsuarioDAO instance = new UsuarioDAO();
        List expResult = null;
        List result = instance.Listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class UsuarioDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        int expResult = 0;
        int result = instance.Agregar(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarPorId method, of class UsuarioDAO.
     */
    @Test
    public void testListarPorId() {
        System.out.println("ListarPorId");
        int id = 0;
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = null;
        Usuario result = instance.ListarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class UsuarioDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        int expResult = 0;
        int result = instance.Actualizar(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class UsuarioDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        int id = 0;
        UsuarioDAO instance = new UsuarioDAO();
        instance.Eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
