/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2g50kevinflorezreto1punto1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kevinf
 */
public class C2G50KevinFlorezReto1Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        float smlv,costoCredito,incremento,descuento,baseMatricula,totalMatricula;
        short cantCreditos,programa,hijos;
        char genero, continuar;
        
        Scanner sc = new Scanner(System.in);
//        continuar = 'S';
        do{
            System.out.println("------Calcular costo de matricula estudiante-------");

            System.out.print("Escriba el NOMBRE del estudiante: ");
                nombre = sc.nextLine();
            
             do{
                System.out.print("Escriba la cantidad de CREDITOS a matricular: ");
                cantCreditos = sc.nextShort();
            }while(cantCreditos <= 0);

            do{
                System.out.println("---Nombres programas---\n1. Tecnología EE\n2. Tecnología Salud\n3. Otros");
                System.out.print("Escriba el CODIGO del Programa: ");
                programa = sc.nextShort();
            }while((programa < 1) || (programa > 3));

            do{
                System.out.print("Digite el GENERO del estudiante (M: masculino, F: femenino): ");
                genero = sc.next().charAt(0);
            }while((genero != 'F') & (genero !='M'));

            smlv = 900000;
            costoCredito = smlv/10;
            incremento = 0;
            descuento = 0;
            totalMatricula = 0;
//            hijos = 0;
            baseMatricula = costoCredito * cantCreditos;
            switch (genero) {
                case 'M':
                    switch (programa) {
                        case 1:
                            incremento = (float) (baseMatricula * 0.15);
                            break;
                        case 2:
                            incremento = (float) (baseMatricula * 0.325);
                            break;
                        case 3:
                            incremento = (float) (baseMatricula * 0.045);
                            break;
                        default:
                            break;
                    }
                    totalMatricula = baseMatricula + incremento;
                    break;
                case 'F':
                    switch (programa) {
                        case 1:
                            incremento = (float) (baseMatricula * 0.1);
                            break;
                        case 2:
                            incremento = (float) (baseMatricula * 0.207);
                            break;
                        case 3:
                            incremento = (float) (baseMatricula * 0.032);
                            break;
                        default:
                            break;
                    }
                    System.out.println("---Por ser mujer se te otorga un DESCUENTO por hijos---");
                    System.out.print("Escriba la cantidad de hijos: ");
                        hijos = sc.nextShort();
                    if(hijos <= 2){
                        descuento = 30000 * hijos;
                    }else if((hijos > 2) & (hijos <= 5) ){
                        descuento = (float) (baseMatricula * 0.25);
                    }else if(hijos > 5){
                        descuento = (float) (baseMatricula * 0.35);
                    }
                    totalMatricula = baseMatricula + incremento - descuento;
                    break;
                default:
                    break;
            }
    //        //Creación de un formato con separadores de decimales y millares, con 2 decimales
            DecimalFormat formato = new DecimalFormat("$#,###.##");
            String valorFormateado = formato.format(totalMatricula);
    //            System.out.println("\nEl total de la matricula es: "+totalMatricula);
            System.out.println("\nEl total de la matricula para "+nombre.toUpperCase()+" es: "+valorFormateado);

            System.out.print("Desea calcular otra matricula? (S: Si): ");
                continuar = sc.next().charAt(0);
        }while(continuar == 'S');
        
    }
    
}
