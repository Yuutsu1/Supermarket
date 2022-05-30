package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PanelProducto extends Panel{
    private ArrayList<Producto> productos;

    public PanelProducto() {
        this.productos = new ArrayList<Producto>();
        productos.add(new Producto("Ruffles pequeño", 6, 0.15, 0.25));
        productos.add(new Producto("Doritos pequeño", 5, 0.20, 0.30));
        productos.add(new Producto("Doritos mediano", 7, 0.40, 0.60));
    }

    public void mostrarFormulario(){
        Scanner scanner = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double costo;
        double pvp;

        System.out.println("--------INGRESO DE PRODUCTOS--------");
        System.out.print("Descripción del producto: ");
        descripcion = scanner.nextLine();
        System.out.print("Cantidad a ingresar: ");
        cantidad = Integer.parseInt(scanner.nextLine());
        System.out.print("Costo del producto: ");
        costo = Double.parseDouble(scanner.nextLine());
        System.out.print("Precio de venta al público (PVP): ");
        pvp = Double.parseDouble(scanner.nextLine());

        if (compareCostPVP(costo, pvp))
            ingresarProducto(new Producto(descripcion, cantidad, costo, pvp));
        else
            System.out.println("El PVP tiene que ser mayor al costo");
    }

    public boolean ingresarProducto(Producto producto){
        return productos.add(producto);
    }

    public boolean compareCostPVP(double costo, double pvp) {
        return pvp > costo;
    }

    public Producto searchProduct(String descripcion) {
        for (Producto producto : productos) {
            if (producto.getDescripcion().equals(descripcion))
                return producto;
        }
        return null;
    }
}
