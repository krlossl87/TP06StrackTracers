/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico3;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class CarroDeCompras {
    //ATRIBUTOS
    private ArrayList<DetalleCarro> detalles = new ArrayList<DetalleCarro>();
    double Total;

    public CarroDeCompras(double Total, DetalleCarro det) {
        this.Total    = Total;
        this.detalles.add(det);
    }


    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
    
    
    //Metodos
    public static boolean valida_nombre_no_sea_vacio(Producto p){
        return !"".equals(p.ProductoNom);
    }
    
    
    public static boolean valida_precio_no_sea_menor_igual_cero(Producto p){
        return p.ProductoPrecio > 0;
    }
    
    
    public static boolean valida_cliente_ape_nom_no_sea_vacio(Cliente c){
        return !("".equals(c.ClienteApe) && "".equals(c.ClienteNom));
    }
    
    public static boolean valida_edad_mayor_igual_18(Cliente c){
        return c.ClienteEdad >= 18;   
    }
    
    public static boolean valida_existencia_detalle(CarroDeCompras cd){
        return !cd.detalles.isEmpty();
    }
    
    public static boolean valida_stock_no_sea_menor_igual_cero(Producto p){
        return p.ProductoStock >= 0;
    }
    
    public static boolean valida_cantidad_no_sea_menor_igual_cero(CarroDeCompras cd){
        int cant = cd.detalles.get(0).getCantidad();
        if (cant<=0) {
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean valida_modelo_producto_no_sea_menor_igual_cero(Producto p){
        return p.ProductoModelo > 0;
    }
}
