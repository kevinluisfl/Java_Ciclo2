
package RETO5;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Estudiante {
   
    float baseMatricula;
    float totalMatricula;
    float costoCredito;
    float smlv = 900000;
    float incremento;
    float descuento;

    public void Calcular(String nombre, int codigo, int creditos, int hijos, int programa, char genero) {
        descuento = 0;
        incremento = 0;
        //Calculamos valor del credito segun la formula
        costoCredito = smlv/10;

        //Valor Base del costo de la matricula segun la cantidad de creditos
        baseMatricula = creditos * costoCredito;

        switch (genero) {
            case 'M':
                //Calcula valor a pagar segun incremento de genero
                switch (programa) {
                    case 1:
                        incremento = baseMatricula * (float) 0.15;
                        break;
                    case 2:
                        incremento = baseMatricula * (float) 0.325;
                        break;
                    case 3:
                        incremento = baseMatricula * (float) 0.045;
                        break;
                    default:
                        break;
                }
                //Calculamos el valor a parag segun el costo de la base mas el incremnto por genero
                totalMatricula = baseMatricula + incremento;

                System.out.println("El valor a pagar del estudiante es: " + totalMatricula);

                break;
            case 'F':

                //Evaluamos la condicion segun la cantidad de hijos
                if (hijos <= 2) {
                    descuento = hijos * 30000;
                }

                if (hijos >= 3 & hijos <= 5) {
                    descuento = baseMatricula * (float) 0.25;
                }

                if (hijos > 5) {
                    descuento = baseMatricula * (float) 0.35;
                }

                //Calcula valor a pagar segun incremento de genero
                switch (programa) {
                    case 1:
                        incremento = baseMatricula * (float) 0.10;
                        break;
                    case 2:
                        incremento = baseMatricula * (float) 0.207;
                        break;
                    case 3:
                        incremento = baseMatricula * (float) 0.032;
                        break;
                    default:
                        break;
                }
                totalMatricula = baseMatricula - descuento + incremento;

                System.out.println("El valor a pagar del estudiante es: " + totalMatricula);

                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }

}
