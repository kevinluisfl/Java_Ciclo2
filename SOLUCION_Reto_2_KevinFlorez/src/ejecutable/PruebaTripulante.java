
package ejecutable;

import java.util.ArrayList;
import java.util.Scanner;
import misClases.ProcedimientosAcademicos;
import misClases.Tripulante;
/**
 *
 * @author kevinf
 */
public class PruebaTripulante {
    public static void main(String[] args) {
        
        ArrayList<Float> notas = new ArrayList();
        float nota;
        int n;
        ///scanner para ingresar datos por consola
        Scanner sc = new Scanner(System.in);
        
        ///creacion de 3 tripulantes de clase Tripulante usando sus dos constructores
        Tripulante t1;
        ///usando constructor que recibe 3 parametros float para los 3 atributos nota
        t1 = new Tripulante(4.5f,4.6f,4.7f);
        ///usando constructor que recibe 2 parametros codigo y nombre
        Tripulante t2 = new Tripulante(12,"Daniel");
        Tripulante t3 = new Tripulante(14,"David");
        
        ///usando setter en el tripulante 1
        t1.setNombre("Kevin");
        t1.setCodigo(10);
        
        ///instanciando la clase ProcedimientosAcademicos
        ProcedimientosAcademicos pa = new ProcedimientosAcademicos();
        
        ///ingreso dinamico de notas en el arraylist de notas
        System.out.print("Cuantas notas va a ingresar?: ");
        n = sc.nextInt();
        for(int i=1; i <= n;i++){
            System.out.print("Ingrese la nota del reto "+i+" de "+n+": ");
            nota = sc.nextFloat();
            notas.add(nota);
        }
        
        ///Usando metodos getter con el Tripulante 1 y de procedimientos academicos
        System.out.println("Nombre estudiante: "+t1.getNombre());
        pa.aprobarCurso(t1.getNota1(),t1.getNota2(),t1.getNota3());
        pa.mayorNota(t1.getNota1(),t1.getNota2(),t1.getNota3()); 
        System.out.println("La nota definitiva es: "+ProcedimientosAcademicos.calcularNotaDEF(t1.getNota1(),t1.getNota2(),t1.getNota3()));
    
        ///usando setter de arraylist notas en tripulante 2
        t2.setNotas(notas);
        
        ///Usando metodos getter con el Tripulante 2 y de procedimientos academicos
        System.out.println("Nombre estudiante: "+t2.getNombre()+"\nCodigo :"+t2.getCodigo());
        pa.aprobarCurso1(t2.getNotas());
        pa.mayorNota1(t2.getNotas());
        System.out.println("La nota definitiva es: "+ProcedimientosAcademicos.calcularNotaDEF1(t2.getNotas()));
   
    }
}
