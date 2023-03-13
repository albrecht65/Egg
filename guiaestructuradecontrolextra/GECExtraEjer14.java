/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos 
de todas las familias.

 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer14 {
    public static void main(String[] args) {
        
        int familias;
        int hijos;
        int edades;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Cantidad de familias");
        familias = sc.nextInt();
        System.out.println("Cantidad de hijos para cada familia");
        hijos = sc.nextInt();
        
        
        edades = (int) (Math.random()*30+0);
        
        System.out.println("La media de edades de los hijos es " + edades);
        
        
    }
    
}
