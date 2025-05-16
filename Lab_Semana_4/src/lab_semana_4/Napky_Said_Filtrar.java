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
public class Napky_Said_Filtrar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra = "";  
        String palabra_mayor="";
        char letra =' ';
        System.out.print("Ingrese Una Frase : ");
        String frase = leer.next();
        
        System.out.print("Ingrese La Longitud Minima De La Palabra : ");
        int longitud = leer.nextInt();
        
        System.out.println("Palabras Con La Longitud De : "+longitud);
        
        for(int indice = 0;indice<frase.length();indice++){
        palabra+= frase.charAt(indice);
        letra=frase.charAt(indice);
        
        if(letra==' '||indice==frase.length()-1){
        palabra_mayor=palabra;
        palabra="";
        
        if(palabra_mayor.length()>longitud){
            System.out.println(palabra_mayor);
        }
        
        }
        
        
        
        }
    }
}
