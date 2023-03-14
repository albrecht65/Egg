
import java.util.Scanner;

/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
 */

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEJer11 {
    
    public static void main(String[] args) {
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int num = sc.nextInt();
        
        while (num != 0){
            // truncar numero para obtener 
            num = (int) (num / 10);
            contador++;
           
            
            
        }
         System.out.println("Cantidad de digitos: " + contador);
        
    }

   
    
}
