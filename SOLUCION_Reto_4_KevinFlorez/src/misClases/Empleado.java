
package misClases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Empleado extends Persona {
    ////atributos primitivos
    private String tipoEmpleado;
    private float salario;
    
    ////atributos de relacion
    public ArrayList<Factura> facturas = new ArrayList<>();

    ///constructor datos primitivos
    public Empleado(String tipoEmpleado, float salario, int dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.tipoEmpleado = tipoEmpleado;
        this.salario = salario;
    }

    //setter and getter
    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
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
            System.out.println("Ya se agregó esta factura en Empleado!");
        }else {
            facturas.add(newfactura);
            newfactura.setEmpleado(this);
            System.out.println("La factura "+newfactura.getCodigof()+" en Empleado se agrego correctamente!");
            
            ///visualizar en menu
             JOptionPane.showMessageDialog(null,"La factura N°:"+newfactura.getCodigof()+", se generó correctamente!","Restaurante",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }
    
}
