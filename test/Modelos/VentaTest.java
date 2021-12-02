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
public class VentaTest {
    
    Venta venta;
    public VentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       // 1	34	2	2	2020-10-01	342342	A
        venta = new Venta(64, 40, 2021112, 34, 56, 5, "02153", "RAM KINGSTON 64GB", "2021-11-12", "Disponible", 200.00,1000.00, 11200.00);
    }
    
    @After
    public void tearDown() {
        venta = null;
    }

    /**
     * Test of getIdVenta method, of class Venta.
     */
    @Test
    public void testGetIdVenta() {
        System.out.println("getIdVenta");
        //Venta instance = new Venta();
        int expResult = 64;
        int result = venta.getIdVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVenta method, of class Venta.
     */
    @Test
    public void testSetIdVenta() {
        System.out.println("setIdVenta");
        int idVenta = 64;
        //Venta instance = new Venta();
        venta.setIdVenta(idVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Venta.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        //Venta instance = new Venta();
        int expResult = 40;
        
        int result = venta.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setItem method, of class Venta.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        int item = 40;
        //Venta instance = new Venta();
        venta.setItem(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProducto method, of class Venta.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        //Venta instance = new Venta();
        int expResult = 2021112;
        int result = venta.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProducto method, of class Venta.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        int idProducto = 2021112;
        //Venta instance = new Venta();
        venta.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdEmpleado method, of class Venta.
     */
    @Test
    public void testGetIdEmpleado() {
        System.out.println("getIdEmpleado");
        //Venta instance = new Venta();
        int expResult = 34;
        int result = venta.getIdEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEmpleado method, of class Venta.
     */
    @Test
    public void testSetIdEmpleado() {
        System.out.println("setIdEmpleado");
        int idEmpleado = 34;
        //Venta instance = new Venta();
        venta.setIdEmpleado(idEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCliente method, of class Venta.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        //Venta instance = new Venta();
        int expResult = 56;
        int result = venta.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCliente method, of class Venta.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        int idCliente = 56;
        //Venta instance = new Venta();
        venta.setIdCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Venta.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        //Venta instance = new Venta();
        int expResult = 5;
        int result = venta.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Venta.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 5;
        //Venta instance = new Venta();
        venta.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroComprobante method, of class Venta.
     */
    @Test
    public void testGetNumeroComprobante() {
        System.out.println("getNumeroComprobante");
        //Venta instance = new Venta();
        String expResult = "02153";
        String result = venta.getNumeroComprobante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroComprobante method, of class Venta.
     */
    @Test
    public void testSetNumeroComprobante() {
        System.out.println("setNumeroComprobante");
        String numeroComprobante = "02153";
        //Venta instance = new Venta();
        venta.setNumeroComprobante(numeroComprobante);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcionProducto method, of class Venta.
     */
    @Test
    public void testGetDescripcionProducto() {
        System.out.println("getDescripcionProducto");
        //Venta instance = new Venta();
        String expResult = "RAM KINGSTON 64GB";
        String result = venta.getDescripcionProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcionProducto method, of class Venta.
     */
    @Test
    public void testSetDescripcionProducto() {
        System.out.println("setDescripcionProducto");
        String descripcionProducto = "RAM KINGSTON 64GB";
        //Venta instance = new Venta();
        venta.setDescripcionProducto(descripcionProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Venta.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        //Venta instance = new Venta();
        String expResult = "2021-11-12";
        String result = venta.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Venta.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "2021-11-12";
        //Venta instance = new Venta();
        venta.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Venta.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        //Venta instance = new Venta();
        String expResult = "Disponible";
        String result = venta.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Venta.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "Disponible";
        //Venta instance = new Venta();
        venta.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Venta.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        //Venta instance = new Venta();
        double expResult = 200.0;
        double result = venta.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Venta.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 200.0;
        //Venta instance = new Venta();
        venta.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotal method, of class Venta.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        //Venta instance = new Venta();
        double expResult = 1000.0;
        double result = venta.getSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtotal method, of class Venta.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        double subtotal = 1000.0;
        //Venta instance = new Venta();
        venta.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Venta.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        //Venta instance = new Venta();
        double expResult = 11200.0;
        double result = venta.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Venta.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 11200.0;
        //Venta instance = new Venta();
        venta.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
