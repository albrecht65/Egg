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
public class GECExtraEjer3 {
 
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte
        si se trata de una vocal. Caso contrario mostrar un mensaje. Nota:
        investigar la función equals() de la clase String.
        */
        Scanner leer = new Scanner(System.in);
        
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.nextLine().toUpperCase();
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal");
        }
        
    }   
}
