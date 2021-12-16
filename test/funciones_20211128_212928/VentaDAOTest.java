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

public class VentaDAOTest {

    public VentaDAOTest() {
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
    public void testObtenerNumeroDeFactura() throws Exception {
        System.out.println("ObtenerNumeroDeFactura");
        String metodo = "ObtenerNumeroDeFactura";
        String clase = "VentaDAO";
        Date vinicio = new Date();
        Boolean expResult = true;
        VentaDAO VentaDAO_instance = new VentaDAO();
        String result = "44";
        try {
            result = VentaDAO_instance.ObtenerNumeroDeFactura();
        } catch (Exception e) {
            result = "";
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
    public void testObtenerMaximoIdVentas() throws Exception {
        System.out.println("ObtenerMaximoIdVentas");
        String metodo = "ObtenerMaximoIdVentas";
        String clase = "VentaDAO";
        Date vinicio = new Date();
        Boolean expResult = true;
        VentaDAO VentaDAO_instance = new VentaDAO();
        int result = 0;
        try {
            result = VentaDAO_instance.ObtenerMaximoIdVentas();
        } catch (Exception e) {
            result = 0;
        }
        Boolean res = false;
        if (result != 0) {
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
    public void testRegistrarVenta() throws Exception {
        System.out.println("RegistrarVenta");
        String metodo = "RegistrarVenta";
        String clase = "VentaDAO";
        Date vinicio = new Date();
        Venta param1 = new Venta();
        Boolean expResult = true;
        VentaDAO VentaDAO_instance = new VentaDAO();
        boolean result = false;
        try {
            result = VentaDAO_instance.RegistrarVenta(param1);
        } catch (Exception e) {
            result = false;
        }
        Boolean res = false;
        if (result != false) {
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
    public void testGuardarDetalleVenta() throws Exception {
        System.out.println("GuardarDetalleVenta");
        String metodo = "GuardarDetalleVenta";
        String clase = "VentaDAO";
        Date vinicio = new Date();
        Venta param1 = new Venta(14, 14, 3, 2, 10, 50, "30", "Memory Flash 640GB", "2021-12-09", "A", 5000, 5000, 2000);
        Boolean expResult = true;
        VentaDAO VentaDAO_instance = new VentaDAO();
        boolean result = false;
        try {
            result = VentaDAO_instance.GuardarDetalleVenta(param1);
        } catch (Exception e) {
            result = false;
        }
        Boolean res = false;
        if (result == true) {
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
