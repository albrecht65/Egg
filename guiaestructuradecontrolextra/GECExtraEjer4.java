
import java.util.Scanner;

/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
muestre su equivalente en romano.
 */

/**
 *
 * @author gabrielaalbrecht
 */
public class GECExtraEjer4 {
    public static void main(String[] args) {
     int num;
             
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese un numero");
        num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("el numero romano de " +num + " es I");
                break;
            case 2:
                System.out.println("el numero romano de " +num + " es II");
                break;
            case 3:
                System.out.println("el numero romano de  " +num + " es III");
                break;
            case 4:
                System.out.println("el numero romano de n " +num + " es IV");
                break;
            case 5:
                System.out.println("el numero romano de " +num + " es V");
                break;
            case 6:
                System.out.println("el numero romano de " +num + " es VI");
                break;
            case 7:
                System.out.println("el numero romano de " +num + " es VII");
                break;
            case 8:
                System.out.println("el numero romano de " +num + " es VIII");
                break;
            case 9:
                System.out.println("el numero romano de de " +num + " es IX");
                break;
            case 10:
                System.out.println("el numero romano de " +num + " es X");
                break;    
         default: 
                System.out.println("el numero ingresado no corresponde");
        
         }
    }
}
         
    
    

