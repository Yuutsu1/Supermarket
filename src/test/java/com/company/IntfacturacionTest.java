package com.company;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

public class IntfacturacionTest extends TestCase {
    @Test
    public void testmock(){
        Intfacturacion fact = Mockito.mock(Intfacturacion.class);
        Mockito.when(fact.iva(1.25, 1.35)).thenReturn(2.6);

        assertEquals(2.6, fact.iva(0, 0));
    }
}