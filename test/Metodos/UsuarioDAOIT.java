/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Config.Conexion;
import Modelos.Usuario;
import java.sql.Connection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Jeffield
 */
public class UsuarioDAOIT {
    
    Conexion conexionMock;
    Connection con;
    public UsuarioDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        conexionMock= Mockito.mock(Conexion.class);
        try{
            Mockito.when(conexionMock.Conexion()).thenReturn(con);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Eliminar method, of class UsuarioDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        int id = 1;
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult=true;
        boolean result = instance.Eliminar(id);
        boolean res=false;
        if(result)
        {
            res=true;
        }
        else
        {
            res=false;
        }
        assertEquals(expResult, res);
    }
    
}
