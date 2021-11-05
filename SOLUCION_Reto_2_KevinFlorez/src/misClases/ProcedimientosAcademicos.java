
package misClases;

import java.util.ArrayList;

/**
 *
 * @author kevinf
 */
public class ProcedimientosAcademicos{
    
    ///CON NOTAS INDIVIDUALES
    //metodo de instancia
    public void aprobarCurso(float n1, float n2, float n3){
        ///definitiva igual o superior a 3.0
        float def = calcularNotaDEF(n1,n2,n3);
        if(def >= 3.0){
            System.out.println("El estudiante APROBÓ!! con "+def);
        }else{
            System.out.println("El estudiante NO APROBÓ!! su nota fue: "+def);
        }
        
    }
    //metodo de instancia
    public void mayorNota(float n1, float n2, float n3){
        ///cuál y cuánto
        if(n1 > n2 && n1 > n3){
            System.out.println("La mayor nota fue del reto 1 con "+n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("La mayor nota fue del reto 2 con "+n2);
        }else if(n3 > n2 && n3 > n1){
            System.out.println("La mayor nota fue del reto 3 con "+n3);
        }
    }
    //metodo de clase
    public static float calcularNotaDEF(float n1, float n2, float n3){
        ///promedio de las notas
        return (n1+n2+n3)/3;
    }
    
    ///CON ARRAYLIST
    public void aprobarCurso1(ArrayList<Float> notas){
        ///definitiva igual o superior a 3.0
        float def = calcularNotaDEF1(notas);
        if(def >= 3.0){
            System.out.println("El estudiante APROBÓ!! con "+def);
        }else{
            System.out.println("El estudiante NO APROBÓ!! su nota fue: "+def);
        }
        
    }
    //metodo de instancia
    public void mayorNota1(ArrayList<Float> notas){
        ///cuál y cuánto
       float mayor = 0;
       int i=0,pos = 0;
       for(Float nota: notas){
           i++;
           if(nota > mayor){
               mayor = nota;
               pos = i;
           }
       }
        System.out.println("La mayor nota fue "+mayor+" en el reto "+pos);
    }
    //metodo de clase
    public static float calcularNotaDEF1(ArrayList<Float> notas){
        ///promedio de las notas
        float suma=0;
        int n = notas.size();
        for(int i=0; i < n; i++){
            suma+=notas.get(i);
        }
        return suma/n;
    }
    
}
