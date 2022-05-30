package com.company;

import java.util.ArrayList;

public class facturacion {
    ArrayList<Double> precios = new ArrayList<>();
    //agregar productos
    public ArrayList insert(Double precio){
        precios.add(1.25);
        precios.add(1.35);
        return precios;
    }

    //Subtotal
    public double subtotal(){
        double sumSubtotal =  calcular(precios);
        return sumSubtotal;
    }

    //Total
    public double total(){
        double valor = 0;
        for (int i = 0; i < precios.size(); i ++){
            valor += precios.get(i);
        }

        return valor;
    }

    //IVA
    public double iva (double sumTotal, double sumSubtotal){
        double calIva = 0;
        calIva =  sumTotal - sumSubtotal;
        return calIva;
    }
     public double calcular(ArrayList prec){
         double valor = 0;
         for (int i = 0; i < prec.size(); i ++){
             valor += prec.get(i);
         }
         return valor;
     }
}
