package TestIT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Config.Conexion;
import Metodos.UsuarioDAO;
import Metodos.UsuarioDAO;
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
public class AuthenticarUsuarioIT {

    Conexion conexionMock;
    Connection con;

    public AuthenticarUsuarioIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        conexionMock = Mockito.mock(Conexion.class);
        try {
            Mockito.when(conexionMock.Conexion()).thenReturn(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Validar method, of class UsuarioDAO.
     */
    @Test
    public void testValidar() throws Exception {
        System.out.println("Authenticación");
        String metodo = "Authenticación";
        String clase = "UsuarioDAO";
        Date vinicio = new Date();
      int param1 = 1075212819;
      String param2 = "123";
        Boolean expResult = true;
        UsuarioDAO UsuarioDAO_instance = new UsuarioDAO();
        Usuario result = new Usuario();
        try {
            result = UsuarioDAO_instance.Validar(param1,param2);
        } catch (Exception e) {
        result = null;
        }
        Boolean res = false;
        if (result != null) {
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
