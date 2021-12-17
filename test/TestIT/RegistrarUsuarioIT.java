/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestIT;

import Config.Conexion;
import Metodos.UsuarioDAO;
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
public class RegistrarUsuarioIT {
    
    Conexion conexionMock;
    Connection con;
    
    UsuarioDAO usuarioDAO;
    List<Usuario> usuarios;
    public RegistrarUsuarioIT() {
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
        
        usuarioDAO=Mockito.mock(UsuarioDAO.class);
        Mockito.when(usuarioDAO.Listar()).thenReturn(usuarios);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAgregar() throws Exception {
        System.out.println("Agregar Usuario");
        String metodo = "Agregar";
        String clase = "UsuarioDAO";
        Date vinicio = new Date();
      Usuario param1 = new Usuario();
        Boolean expResult = true;
        UsuarioDAO UsuarioDAO_instance = new UsuarioDAO();
        int result = 0;
        try {
            result = UsuarioDAO_instance.Agregar(param1);
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
