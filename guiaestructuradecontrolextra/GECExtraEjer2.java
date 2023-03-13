/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.

 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer2 {
    
    public static void main(String[] args) {
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la variable A");
        int A = sc.nextInt();
        System.out.println("Ingrese la variable B");
        int B = sc.nextInt();
        System.out.println("Ingrese la variable C");
        int C = sc.nextInt();
        System.out.println("Ingrese la variable D");
        int D = sc.nextInt();
        System.out.println("El valor de las variables ingresadas son: " + A + "," + B + "," +C + "," + D);
        
        
        aux1 = B; // aux1 tiene valor B
        aux2 = C; // aux s tiene valor C
        B = aux2;
        aux3 = D;
        D = aux1;
        C = A;
        A = aux3;
       
        
        
        System.out.println("El valor de las variables procesadas son: " + A + "," + B + "," +C + "," + D);
        
                
        
    }
    
}
