package tarea.semana4;

/**
 *
 * @author Server
 */
import java.util.Scanner;
public class NumeroEnIngles {
    public static void main (String[]args){
        //Declarar variables
        int numero;
        String ingles="";
        Scanner lectura= new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese un número del [1-6]: ");
        numero = lectura.nextInt();
        switch (numero) {
            case 1: ingles="one";
            break;
            case 2: ingles="two";
            break;
            case 3: ingles="three";
            break;
            case 4: ingles="four";
            break;
            case 5: ingles="five";
            break;
            case 6: ingles="six";
            break;
            default:
                System.out.println("Numero invalido. Debe ingresar un número entre 1 y 6 ");
                break;
        }
           if (numero>=1 && numero<=6)
           System.out.println("El numero en ingles es "+ingles);
           
        
        }
     
    }
