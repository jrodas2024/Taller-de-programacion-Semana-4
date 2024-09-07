package tarea.semana4;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class NumeroEnPalabras {
    public static void main(String[] args) {
        // Declarar variables
        int numero;
        String palabra = "";
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar un número del [1-5]: ");
        numero = lectura.nextInt();
        
        // Proceso de datos
        switch(numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                // Mensaje de error si el número no está entre 1 y 5
                System.out.println("Número inválido. Debe ingresar un número entre 1 y 5.");
                break;
        }
        
        // Salida de datos si el número es válido
        if (numero >= 1 && numero <= 5) {
            System.out.println("El número ingresado es: " + palabra);
        }
    }
}