/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_4;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said_codigoEnigma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion=0;
        
       
        String par= "";
        String impar="";
        int numero_par=0;
        int numero_impar=0;
        
        while(opcion!=3){
        
             System.out.println("Ingrese Una Palabra");
             String palabra = leer.next();
        
            System.out.println("[1]-Encriptar Texto");
            System.out.println("[2]-Desencriptar Texto");
            System.out.println("[3]-Regresar");
            
            switch(opcion){
            
                case 1:
                    for(int indice=0;indice<palabra.length();indice++){
                        numero_par+=0;
                    par+=palabra.charAt(numero_par);
                    numero_par+=2;
                    
                    if(indice!=numero_par){
                    impar+=palabra.charAt(indice);
                    }
                    
                    }
                    break;
            
            }
        
        }
    }
}