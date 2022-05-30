package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PanelProductoTest {

    private PanelProducto p = null;

    @Before
    public void setUp(){
        p = new PanelProducto();
    }

    @Test
    public void given_producto_when_ingresar_producto_then_ok(){
        p = new PanelProducto();
        Producto producto = new Producto("Doritos pequeño", 5, 0.15, 0.25);
        assertTrue(p.ingresarProducto(producto));
    }

    @Test
    public void given_description_when_search_product_then_ok(){
        p = new PanelProducto();
        assertNotNull(p.searchProduct("Doritos pequeño"));
    }
}