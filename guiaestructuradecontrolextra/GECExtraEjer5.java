/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos s
obre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.

 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer5 {
    public static void main(String[] args) {
        String clase;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la clase de socio: A, B, C");
        clase = sc.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        Double costo = sc.nextDouble();
        
        switch (clase){
            case "A":
                costo = (costo * 0.50);
                System.out.println("el importe a pagar es " + costo);
                break;
            case "B":
                costo = (costo * 0.35);
                System.out.println("el importe a pagar es " + costo);
                break;
            case "C":

                System.out.println("el importe a pagar es " + costo);
                break;
            default:
                System.out.println("La opcion ingresado no es correcta");
        
        }
        
    }
    
}
