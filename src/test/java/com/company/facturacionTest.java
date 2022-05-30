package com.company;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class facturacionTest {
    @Test
    public void given_one_arraylist_when_iva_then_ok(){
        facturacion f = new facturacion();
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(1.25);
        expected.add(1.35);
        ArrayList<Double> actual = new ArrayList<Double>(f.precios);
        assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{actual});
    }
@Test
    public void given_twoResults_when_total_then_ok() {
        facturacion f = new facturacion();
        double expected = 2.60;
        double actual = f.iva(1.35, 1.25);
        assertEquals(expected, actual, 2.60);
    }
@Test
    //si hay productos en la lista
    public void testassertThatThrows(){
        facturacion f = new facturacion();
        ArrayList<Double> actual = new ArrayList<>();
        assertThat(actual.size(), CoreMatchers.is(CoreMatchers.equalTo(2)));
}

@Test
    public void testmock(){

}


}