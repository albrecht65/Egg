/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Debe ingresar altura
 */
package guiaestructuradecontrolextra;

import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer13 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        int n= new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            for(int z=1;z<=i;z++){
                System.out.print(z);
            }
            System.out.println("");
    }
}
}
