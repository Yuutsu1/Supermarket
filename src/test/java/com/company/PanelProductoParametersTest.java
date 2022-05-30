package com.company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class PanelProductoParametersTest {
    private double a, b;
    private boolean expected;

    @Parameterized.Parameters
    public static Iterable<Object []> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{4.25, 5.50, true});
        objects.add(new Object[]{5, 5, false});
        objects.add(new Object[]{6.50, 7, true});
        objects.add(new Object[]{8, 6.5, false});
        objects.add(new Object[]{0.15, 0.25, true});
        return objects;
    }

    public PanelProductoParametersTest(double a, double b, boolean expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_compare_then_ok(){
        PanelProducto p = new PanelProducto();
        assertEquals(expected, p.compareCostPVP(a, b));
    }
}
