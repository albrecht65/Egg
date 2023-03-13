/*
 Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas
es el cociente.
divisor numero que divide
dividendo numero que se va a dividir
cociente es igual a las veces en que se resta el numero
 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer9 {
    public static void main(String[] args) {
        int  cociente = 0;
        int contador =0;
       
                
        
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresar un dividendo y divisor ");
            int dividendo = sc.nextInt();
            int divisor = sc.nextInt();
            
        while (dividendo > divisor ) {
 
            cociente = dividendo - divisor;
            dividendo = cociente;
            contador = contador + 1;
        }    
            System.out.println("el residuo es " + cociente); 
            System.out.println("el cociente es:" + contador);
            
        
    }
    }
    


    

    
