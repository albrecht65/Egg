/*
 Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package guiaestructuradecontrolextra;


import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer6 {
    public static void main(String[] args) {
        double altura, suma1, suma2;
        int n;
        int i, ib; 
        ib = 0;
        suma1 = 0;
        suma2 = 0;
            
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese cantidad personas a encuestar");
        n = sc.nextInt();
         
        for (i = 0; i <= n-1; i++){ 
        System.out.println("Ingrese la altura de la persona");
        //carga altura con comas
        altura = sc.nextDouble();
        // con float no funcionaba.
            if (altura <= 1.60) {
            suma1 += altura;
            ib += 1; // acumulador            
        } else
            suma2 += altura;
        } 
        System.out.println("El promedio de estaturas debajo 1.6 es: " + (suma1/ib));
        System.out.println("El promedio de estaturas es: " + (suma1+suma2)/n);
    }
}


