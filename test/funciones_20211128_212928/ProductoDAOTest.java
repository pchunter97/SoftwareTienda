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

public class ProductoDAOTest {

    public ProductoDAOTest() {
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
    public void testConsultaPorCodigo() throws Exception {
        System.out.println("ConsultaPorCodigo");
        String metodo = "ConsultaPorCodigo";
        String clase = "ProductoDAO";
        Date vinicio = new Date();
      int param1 = 3;
        Boolean expResult = true;
        ProductoDAO ProductoDAO_instance = new ProductoDAO();
        Producto result = new Producto();
        try {
            result = ProductoDAO_instance.ConsultaPorCodigo(param1);
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
        String clase = "ProductoDAO";
        Date vinicio = new Date();
        Boolean expResult = true;
        ProductoDAO ProductoDAO_instance = new ProductoDAO();
        List result = new ArrayList();
        try {
            result = ProductoDAO_instance.Listar();
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
    }}
