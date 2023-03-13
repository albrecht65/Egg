/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 
lo sustituya por una E. 
 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer12 {
  
    public static void main(String[] args) {
        
        for(int i=0;i<=9;i++){
            for(int z=0;z<=9;z++){
                for(int c=0;c<=9;c++){
                    //Esto se llama operador ternario
                    //Solo se utiliza si es que haremos operaciones if de una sola linea
                    //En variables cuando solo devuelven 1 solo valor
                    String contador= (Integer.toString(i).equals("3") ? "E" : Integer.toString(i))+"-"+
                                     (Integer.toString(z).equals("3") ? "E" : Integer.toString(z))+"-"+
                                     (Integer.toString(c).equals("3") ? "E" : Integer.toString(c));
                    System.out.println(contador);
                }
            }
        }
    }
    
}      
    
 

