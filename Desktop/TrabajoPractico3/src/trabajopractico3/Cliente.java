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
public class Cliente {
    //ATRIBUTOS
        String ClienteId;
        String ClienteNom;
        String ClienteApe;
        int ClienteEdad;
        int ClienteDNI;
        String ClienteCelular;

    public Cliente(String ClienteNom, String ClienteApe, int ClienteEdad, int ClienteDNI, String ClienteCelular) {
        this.ClienteNom = ClienteNom;
        this.ClienteApe = ClienteApe;
        this.ClienteEdad = ClienteEdad;
        this.ClienteDNI  = ClienteDNI;
        this.ClienteCelular = ClienteCelular;
    }

    public String getClienteId() {
        return ClienteId;
    }

    public String getClienteNom() {
        return ClienteNom;
    }

    public String getClienteApe() {
        return ClienteApe;
    }

    public int getClienteEdad() {
        return ClienteEdad;
    }

    public void setClienteId(String ClienteId) {
        this.ClienteId = ClienteId;
    }

    public void setClienteNom(String ClienteNom) {
        this.ClienteNom = ClienteNom;
    }

    public void setClienteApe(String ClienteApe) {
        this.ClienteApe = ClienteApe;
    }

    public void setClienteEdad(int ClienteEdad) {
        this.ClienteEdad = ClienteEdad;
    }
        
   public static boolean valida_dni_no_sea_vacio(Cliente c){
      return c.ClienteDNI > 0;
   }
   
   public static boolean valida_celular_no_sea_vacio(Cliente c){
      return !c.ClienteCelular.equals("");
   }
}
