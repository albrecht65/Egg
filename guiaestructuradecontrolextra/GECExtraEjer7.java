
import java.util.Scanner;




/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer7 {
    public static void main(String[] args) {
        int num, cant, max, min, contador;
        double suma, prom;
        contador = 0;
        suma = 0;
        
          
          
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros");
        cant = sc.nextInt();
        
        System.out.println("ingrese los numeros");
            num = sc.nextInt();
          max = num;
          min = num;
        
         do {
             contador++;
      
       if(num>max){
                max= num;
             }
        else if (num < min){
                min = num;
            }
            suma += num;
            
            System.out.println("ingrese los numeros");
            num = sc.nextInt();
            
        } while (contador <= (cant-1));
           
        System.out.println("el promedio de los numeros es: " + (prom = suma/cant));
        System.out.println("el numeros maximo y minimos son: " + max + "y" + min);
}
}
// HACE UNA VUELTA MAS PERO NO LO TOMA EN LOS DATOS PORQUE LO PARA EL LIMITE
// CONTADOR.