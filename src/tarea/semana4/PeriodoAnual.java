package tarea.semana4;

/**
 *
 * @author Server
 */
import java.util.Scanner;
public class PeriodoAnual {
    public static void main(String[] args) {
        // Declarar variables
        int numero;
        String periodo = "";
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresa un número entre 1, 2, 3, 4, 6, 12: ");
        numero = lectura.nextInt();
        
        // Proceso de datos:
        switch(numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                System.out.println("Número inválido. Debes ingresar uno de estos números: 1, 2, 3, 4, 6, 12.");
                break;
        }
        if (numero == 1 || numero == 2 || numero == 3 || numero == 4 || numero == 6 || numero == 12) {
            System.out.println("El periodo correspondiente es: " + periodo);
        }
    }
}