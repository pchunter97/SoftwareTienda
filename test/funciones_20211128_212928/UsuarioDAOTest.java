package funciones_20211128_212928;

import Modelos.*;
import Metodos.*;
import funciones.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

@Test
    public void testBuscarCliente() throws Exception {
        System.out.println("BuscarCliente");
        String metodo = "BuscarCliente";
        String clase = "UsuarioDAO";
        Date vinicio = new Date();
      int param1 = 3;
        Boolean expResult = true;
        UsuarioDAO UsuarioDAO_instance = new UsuarioDAO();
        Usuario result = new Usuario();
        try {
            result = UsuarioDAO_instance.BuscarCliente(param1);
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
@Test
    public void testValidar() throws Exception {
        System.out.println("Validar");
        String metodo = "Validar";
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
@Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        String metodo = "Listar";
        String clase = "UsuarioDAO";
        Date vinicio = new Date();
        Boolean expResult = true;
        UsuarioDAO UsuarioDAO_instance = new UsuarioDAO();
        List result = new ArrayList();
        try {
            result = UsuarioDAO_instance.Listar();
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
@Test
    public void testListarPorId() throws Exception {
        System.out.println("ListarPorId");
        String metodo = "ListarPorId";
        String clase = "UsuarioDAO";
        Date vinicio = new Date();
      int param1 = 3;
        Boolean expResult = true;
        UsuarioDAO UsuarioDAO_instance = new UsuarioDAO();
        Usuario result = new Usuario();
        try {
            result = UsuarioDAO_instance.ListarPorId(param1);
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
@Test
    public void testAgregar() throws Exception {
        System.out.println("Agregar");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
