/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import misClases.Cliente;
import misClases.Empleado;
import misClases.PlatoMenu;
import misClases.Factura;

/**
 *
 * @author kevinf
 */
public class Test {
    public static void main(String[] args) {
        ///platillos
        PlatoMenu p1 = new PlatoMenu(987,"Hamburguesa",8000f,12000f);
        PlatoMenu p2 = new PlatoMenu(988,"Pizza",9000f,14000f);
        PlatoMenu p3 = new PlatoMenu(989,"Lasagna",5500f,10000f);
        PlatoMenu p4 = new PlatoMenu(934,"Batido",3500f,7500f);
        
        String[] platos = {p1.getNombre(),p2.getNombre(),p3.getNombre(),p4.getNombre()};
        
        ///empleados
        Empleado e1 = new Empleado("cajero",900000f,345,"pepito",32);
        Empleado e2 = new Empleado("mesero",750000f,5264,"maria",26);
        
        String[] empleados = {e1.getNombre(),e2.getNombre()};
       
        ///creando una instancia de factura para usar globalmente
        Factura ff = new Factura();
        
        boolean salir = false;
        String opcion;
        String datosMenu;
        do {
            datosMenu = "*** SISTEMA RESTAURANTE  ***\n"
                    + "1. Crear Factura\n"
                    + "2. Agregar platillo\n"
                    + "3. Facturar\n"
                    + "4. Total factura\n"
                    + "5. Salir\n"
                    + "\nIngrese opción: ";
            opcion = JOptionPane.showInputDialog(datosMenu);
                   switch (opcion) {
                case "1":
                  System.out.println("Opcion 1: Crear factura");
                    
                    int cod;
                    String fecha;
                    ///ingresando datos de la factura
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código de factura: \n"));
                    fecha = JOptionPane.showInputDialog("Ingrese la fecha usando '/' para separar dia/mes/año: \n");
                    
                    Factura f = new Factura(cod,fecha);
                    ff = f;
                    
                    break;
                case "2":
                    System.out.println("Opcion 2: Agregar platillo");
                     
                    Object menuplatos = JOptionPane.showInputDialog(null,"Seleccione Un platillo",
                    "Menu ofertado", JOptionPane.QUESTION_MESSAGE, null,platos,null);
                     
                     System.out.println(menuplatos);
                     //mandando platillo segun el escogido
                     if(menuplatos=="Hamburguesa"){
                         ff.agregarPlatillo(p1);
                     }else if(menuplatos=="Pizza"){
                         ff.agregarPlatillo(p2);
                     }else if(menuplatos=="Lasagna"){
                         ff.agregarPlatillo(p3);
                     }else if(menuplatos=="Batido"){
                         ff.agregarPlatillo(p4);
                     }
           
                    break;
                case "3":
                    System.out.println("Opcion 3: Facturar");
                    String tipocliente;
                    int codigo;
                    String nombre;
                    int edad;
                    
                    ///capturando datos a pasar al constructor de cliente
                     Object ticli = JOptionPane.showInputDialog(null,"Seleccione Un tipo de cliente",
                     "Tipos de clientes", JOptionPane.QUESTION_MESSAGE, null,
                      new Object[] { "Basic","Deluxe", "Gold" },"Basic");
                    tipocliente = (String) ticli;
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código del cliente: \n"));
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: \n");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: \n"));
                    
                    ////creando objeto cliente
                    Cliente c = new Cliente(tipocliente,codigo,nombre,edad);
                    ///escogiendo empleado de los creados previamente
                    Object emple = JOptionPane.showInputDialog(null,"Seleccione Un empleado",
                    "Quien atendió", JOptionPane.QUESTION_MESSAGE, null,empleados,null);
                    
                    System.out.println(emple);
                    ///mandando empleado segun el escogido
                    if(emple=="pepito"){
                        ff.facturar(c, e1);
                    }else if(emple=="maria"){
                        ff.facturar(c, e2);
                    }
                   
                    break;
                case "4":
                    System.out.println("Opcion 4: Total factura");
                    ff.totalFactura();
                    break;
                default:
                    salir = true;
                    break;
            }
        } while (salir != true);
     
    }
}
