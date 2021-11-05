
package misClases;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class PlatoMenu {
    ////atributos primitivos
    private int codigop;
    private String nombre;
    private float costo;
    private float preciov;
    
    ////atributos de relacion
    public ArrayList<Factura> facturas = new ArrayList<>();
    
    ///constructor datos primitivos
    public PlatoMenu(int codigop, String nombre, float costo, float preciov) {
        this.codigop = codigop;
        this.nombre = nombre;
        this.costo = costo;
        this.preciov = preciov;
    }

    //setter and getter
    public int getCodigop() {
        return codigop;
    }
    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPreciov() {
        return preciov;
    }
    public void setPreciov(float preciov) {
        this.preciov = preciov;
    }
    
     ///setter relacion
    public void setFactura(Factura newfactura){
         Factura fact;
        boolean ban = false;
        
        for(int i = 0; (i < facturas.size()) && (!ban); i++){
            fact = facturas.get(i);
            if(fact.getCodigof()== newfactura.getCodigof()){
                ban = true;
            }
        }
        
        if(ban){
            System.out.println("Ya se agregó esta factura PLATILLOS!");
        }else {
            facturas.add(newfactura);
//            System.out.println("La factura "+newfactura.getCodigof()+" se agrego correctamente!");
        }
    }
    
}
