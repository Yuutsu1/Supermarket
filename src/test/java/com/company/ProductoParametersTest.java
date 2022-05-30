package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ProductoParametersTest {
    private double a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object []> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{100, 130, 30});
        objects.add(new Object[]{3, 5, 66.66});
        objects.add(new Object[]{0.25, 0.5, 100});
        objects.add(new Object[]{0.1, 0.5, 400});
        objects.add(new Object[]{1, 1.01, 1});
        return objects;
    }

    public ProductoParametersTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void give_parameters_when_calculate_profit_then_ok(){
        Producto p = new Producto();
        assertEquals(expected, p.calculateProfit(a, b), 0.01);
    }
}