
package misClases;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class Tripulante {
    int codigo;
    private String nombre;
    float nota1;
    float nota2;
    float nota3;
    ArrayList<Float> notas = new ArrayList<>();
    
    ////CONSTRUCTORES
    public Tripulante(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public Tripulante(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    ///GETTERS Y SETTERS
    ////codigo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    ///nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ///nota 1
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    ///nota 2
    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    ///nota 3
    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    ///Array notas
    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }
   
}
