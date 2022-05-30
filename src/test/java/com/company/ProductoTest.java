package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductoTest {

    @Test
    public void given_integer_when_decrease_inventory_then_ok(){
        Producto p = new Producto("Doritos mediano", 7, 0.40, 0.60);
        assertSame(Producto.Mensaje.CORRECTO, p.decreaseInventory(2));
    }
}
