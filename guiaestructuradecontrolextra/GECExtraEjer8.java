/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de
la sentencia break.

 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer8 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int  contar, contarpar, contarimpar;
        contar =0;
        contarpar = 0;
        contarimpar = 0;
        double num = 0;
                
        /* while true genera el bucle infinito y se debe parar con break.
        Si pusiera condicion en el while 
        */
        
        while (true) {
        System.out.println("Introduce un numero: ");
            num= new Scanner(System.in).nextInt();
        
        if (num % 5 == 0) break;
        if (num >= 0) contar ++;   
        if (num % 2 == 0 && num > 0) contarpar ++;        
        if (num %2 != 0 && num > 0) contarimpar ++;
        }
            System.out.println("la cantidad numeros leidos fueron: " + contar);
            System.out.println("la cantidad numeros leidos pares fueron: " + contarpar);
            System.out.println("la cantidad numeros leidos impares fueron: " + contarimpar);
            
      
}
    }
