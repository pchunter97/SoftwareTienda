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
public class ProductoTest {
    
    Producto producto1;
    public ProductoTest() {      
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        producto1 = new Producto(1,"NameProduct","DescriptionProduct","UND","Price");
    }
    
    @After
    public void tearDown() {
        producto1=null;
    }

    /**
     * Test of getCodigo method, of class Producto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        //Producto instance = new Producto();
        int expResult = 1;
        int result = producto1.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Producto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        //Producto instance = new Producto();
        producto1.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreProducto method, of class Producto.
     */
    @Test
    public void testGetNombreProducto() {
        System.out.println("getNombreProducto");
        //Producto instance = new Producto();
        String expResult = "NameProduct";
        String result = producto1.getNombreProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreProducto method, of class Producto.
     */
    @Test
    public void testSetNombreProducto() {
        System.out.println("setNombreProducto");
        String nombreProducto = "Name";
        //Producto instance = new Producto();
        producto1.setNombreProducto(nombreProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Producto.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        //Producto instance = new Producto();
        String expResult = "DescriptionProduct";
        String result = producto1.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Producto.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "Description2";
        //Producto instance = new Producto();
        producto1.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUnidad method, of class Producto.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        //Producto instance = new Producto();
        String expResult = "UND";
        String result = producto1.getUnidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUnidad method, of class Producto.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        String unidad = "UND2";
        //Producto instance = new Producto();
        producto1.setUnidad(unidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        //Producto instance = new Producto();
        String expResult = "Price";
        String result = producto1.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        String precio = "Price2";
        //Producto instance = new Producto();
        producto1.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
