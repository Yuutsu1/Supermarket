package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void given_cliente_when_rechazarCedula_then_false(){
        Cliente c = new Cliente("1724786734");
        assertFalse(c.rechazarCedula(c.getCedula()));
    }

    @Test
    public void given_cliente_when_buscarCliente_then_ok(){
        Cliente c = new Cliente();
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("1724786734"));
        clientes.add(new Cliente("1713312344"));
        clientes.add(new Cliente("1724786767"));
        clientes.add(new Cliente("0501368807"));
        assertNull(c.buscarCliente(clientes,"1724788888"));
    }



}

