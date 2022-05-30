package com.company;

public class Producto {
    private String descripcion;
    private int cantidad;
    private double costo;
    private double pvp;
    private double porcentajeGanancia;



    enum Mensaje{
        CORRECTO, ERROR
    }

    public Producto(String descripcion, int cantidad, double costo, double pvp) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costo = costo;
        this.pvp = pvp;
        this.porcentajeGanancia = calculateProfit(costo, pvp);
    }

    public Producto() {

    }

    public double calculateProfit(double costo, double pvp) {
        return (pvp/costo - 1)*100;
    }

    public Mensaje decreaseInventory(int cantidadAReducir) {
        if (this.cantidad >= cantidadAReducir){
            this.cantidad -= cantidadAReducir;
            return Mensaje.CORRECTO;
        } else
            return Mensaje.ERROR;
    }


    public String getDescripcion() {
        return descripcion;
    }
}
