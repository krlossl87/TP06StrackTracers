/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico3;

/**
 *
 * @author Gonzalo
 */
public class Producto {
    //ATRIBUTOS
        String ProductoId;
        String ProductoNom;
        double ProductoPrecio;
        String ProductoDescripcion;
        int ProductoStock;
        int ProductoModelo;
        

    public Producto( String ProductoNom, double ProductoPrecio, String ProductoDescripcion, int ProductoStock, int ProductoModelo) {
        this.ProductoNom = ProductoNom;
        this.ProductoPrecio = ProductoPrecio;
        this.ProductoDescripcion = ProductoDescripcion;
        this.ProductoStock = ProductoStock;
        this.ProductoModelo = ProductoModelo;
    }

    public String getProductoId() {
        return ProductoId;
    }

    public String getProductoNom() {
        return ProductoNom;
    }

    public double getProductoPrecio() {
        return ProductoPrecio;
    }

    public String getProductoDescripcion() {
        return ProductoDescripcion;
    }

    public int getProductoStock() {
        return ProductoStock;
    }



    public void setProductoId(String ProductoId) {
        this.ProductoId = ProductoId;
    }

    public void setProductoNom(String ProductoNom) {
        this.ProductoNom = ProductoNom;
    }

    public void setProductoPrecio(double ProductoPrecio) {
        this.ProductoPrecio = ProductoPrecio;
    }

    public void setProductoDescripcion(String ProductoDescripcion) {
        this.ProductoDescripcion = ProductoDescripcion;
    }

    public void setProductoStock(int ProductoStock) {
        this.ProductoStock = ProductoStock;
    }
    
    public static boolean valida_descripcion_no_sea_vacio(Producto p){
        return !p.ProductoDescripcion.equals("");
    }
}


    
