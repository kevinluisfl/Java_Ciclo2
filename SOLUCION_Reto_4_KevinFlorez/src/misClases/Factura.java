
package misClases;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Factura {
    DecimalFormat f = new DecimalFormat("$#,###.##");
    ////atributos primitivos
    private int codigof;
    private String fecha;
    
    ////atributos de relacion
    public Cliente cliente;
    public Empleado empleado;
    public ArrayList<PlatoMenu> platillos = new ArrayList<>();
  
    ///constructor datos primitivos
    public Factura(){
        ///para poder iniciar factura vacia en el menu
    }
    public Factura(int codigof, String fecha) {
        this.codigof = codigof;
        this.fecha = fecha;
        JOptionPane.showMessageDialog(null,"La factura N°: "+codigof+", se creó correctamente!","Restaurante",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //setter and getter
    public int getCodigof() {
        return codigof;
    }
    public void setCodigof(int codigof) {
        this.codigof = codigof;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    ////metodo de facturacion para relacion
    public void facturar(Cliente newcliente, Empleado newempleado){
        newcliente.setFactura(this);
        newempleado.setFactura(this);
    }
    
    ////getter and setter relacion
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    /////anexar platillo a la factura, relacion con clase PlatoMenu
    public void agregarPlatillo(PlatoMenu newplatillo){
        ///NO CREO QUE DEBA VALIDAR SI YA EXISTE
        PlatoMenu pm;
        boolean ban = false;
       
        for (int i = 0; (i < platillos.size())&&(!ban); i++){
            pm = platillos.get(i);
            if(pm.getCodigop() == newplatillo.getCodigop()){
                ban = true;
            }
        }
        
        if(ban){
            System.out.println("El plato "+newplatillo.getNombre()+" ya fue agregado a esta factura");
        }
        else {
            platillos.add(newplatillo);
            newplatillo.setFactura(this);
            System.out.println("El plato "+newplatillo.getNombre()+" fue agregado correctamente!");
            
            ///visualizar en menu
            JOptionPane.showMessageDialog(null,"El plato: "+newplatillo.getNombre()+", fue agregado correctamente!","Restaurante",JOptionPane.INFORMATION_MESSAGE);
        
        }
    }
    
    ////para chicanear
    public void totalFactura(){
        float suma=0;
        for(int i = 0; i < platillos.size(); i++){
           suma+= platillos.get(i).getPreciov();
        }
        System.out.println("El total de la factura es: "+f.format(suma));
        
        ///visualizar en menu
        JOptionPane.showMessageDialog(null, "Factura N°: "+codigof+" --- Fecha: "+fecha+
                "\nTotal factura: "+f.format(suma),"Restaurante",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
