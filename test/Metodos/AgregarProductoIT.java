package Metodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Config.Conexion;
import Metodos.ProductoDAO;
import Modelos.Producto;
import Modelos.Usuario;
import funciones.Util;
import java.sql.Connection;
import java.util.Date;
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
public class AgregarProductoIT {
    
    
    UsuarioDAO autenticarMock;
    Usuario usuario;
    
    Conexion conexionMock;
    Connection con;
    public AgregarProductoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        autenticarMock=Mockito.mock(UsuarioDAO.class);
        Mockito.when(autenticarMock.Validar(1234, "password")).thenReturn(usuario);
        
        
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
     * Test of Agregar method, of class ProductoDAO.
     */
    @Test
    public void testAgregar() throws Exception {
        System.out.println("Agregar");
        String metodo = "Agregar";
        String clase = "ProductoDAO";
        Date vinicio = new Date();
      Producto param1 = new Producto();
        Boolean expResult = true;
        ProductoDAO ProductoDAO_instance = new ProductoDAO();
        int result = 0;
        try {
            result = ProductoDAO_instance.Agregar(param1);
        } catch (Exception e) {
        result = 0;
        }
        Boolean res = false;
        if (result == 0) {
            res = true;
        } else {
            res = false;
        }
        assertEquals(expResult, res);
        Date vfinal = new Date();
        long duracion = Util.DiferenciaFechas(vinicio, vfinal);
        Util.exportar(clase, metodo, duracion);
    }

    
}
