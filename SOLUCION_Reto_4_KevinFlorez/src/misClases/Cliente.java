
package misClases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Cliente extends Persona {
    ////atributos primitivos
    private String tipoCliente;
    
    ////atributos de relacion
    public ArrayList<Factura> facturas = new ArrayList<>();

    ///constructor datos primitivos
    public Cliente(String tipoCliente, int dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.tipoCliente = tipoCliente;
    }
   
    //setter and getter 
    public String getTipoCliente(){
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
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
            System.out.println("Ya se agregó esta factura en Cliente!");
        }else {
            facturas.add(newfactura);
            newfactura.setCliente(this);
            System.out.println("La factura "+newfactura.getCodigof()+" en Cliente se agrego correctamente!");
            
        }
        
    }
    
}
