package tarea.semana4;

/**
 *
 * @author Server
 */
import java.util.Scanner;
public class NumeroEnRomanos {
    public static void main (String[] args){
        //Declarar variables
        int numero;
        String romano = "";
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese un número del [1-10]: ");
        numero=lectura.nextInt();
        switch (numero) {
            case 1: romano = "I";
            break;
            case 2: romano = "II";
            break;
            case 3: romano= "III";
            break;
            case 4: romano= "IV";
            break;
            case 5: romano= "V";
            break;
            case 6: romano= "VI";
            break;
            case 7: romano= "VII";
            break;
            case 8: romano= "VIII";
            break;
            case 9: romano= "IX";
            break;
            case 10: romano= "X";
            break;
            default:
                System.out.println("Número invalido. Debe ingresar un número entre 1 y 10");
                break;
                
        }
              if (numero>=1 && numero <=10)
                  System.out.println("El numero en romano es "+romano);
    }
   
}
