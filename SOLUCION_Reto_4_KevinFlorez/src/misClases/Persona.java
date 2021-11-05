
package misClases;

/**
 *
 * @author kevinf
 */
public class Persona {
    ////atributos primitivos
    private int dni;
    private String nombre;
    private int edad;

    ///constructor datos primitivos
    public Persona(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    //setter and getter 
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
