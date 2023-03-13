/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer10b {
   public static void main(String[] args) {
        int resultAzar;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el resultado esperado multiplicacion numeros");
        int resultado = sc.nextInt();
        
        do {
        int numAzar1 = (int) (Math.random()*10+1);
        int numAzar2 = (int) (Math.random()*10+1);
        resultAzar = numAzar1 * numAzar2;
        if (resultado == resultAzar) {
          System.out.println("respuesta correcta:" + resultAzar);
    
        } else 
        System.out.println("respuesta incorrecta:" + resultAzar);  
        
        } while (resultado != resultAzar);
            
    } 
}
