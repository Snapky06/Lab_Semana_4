/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_4;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
import java.util.Scanner;

public class Napky_Aguilar_Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int opcionMenu;

         do {
             System.out.println("\nBienvenido al Sistema"
                     + "\n ---Menu Principal---");
             System.out.println("1. Cifrado Cesar");
             System.out.println("2. Filtrar");
             System.out.println("3. Codigo Enigma");
             System.out.println("4. Abandonar Sistema");
             System.out.print("Ingrese una opcion: ");
             opcionMenu = sc.nextInt();
             sc.nextLine(); 

             switch (opcionMenu) {
                 case 1:
                     String Abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                     String CadenaTexto;
                     int posicionLetra;
                     int posicionNueva;
                     int Desplazamiento;
                     String fraseCifrada = "";

                     System.out.println("Ingrese una cadena de texto: ");
                     CadenaTexto = sc.nextLine().toUpperCase(); 

                     System.out.println("Ingrese el desplazamiento deseado: ");
                     Desplazamiento = sc.nextInt();
                     sc.nextLine(); 

                     for (int i = 0; i < CadenaTexto.length(); i++) {
                         char letra = CadenaTexto.charAt(i);

                         if (Abecedario.indexOf(letra) != -1) {
                             posicionLetra = Abecedario.indexOf(letra);
                             posicionNueva = (posicionLetra + Desplazamiento) % Abecedario.length();
                             fraseCifrada += Abecedario.charAt(posicionNueva);
                         } else {
                             fraseCifrada += letra; 
                         }
                     }

                     System.out.println("La frase cifrada seria: " + fraseCifrada);
                     break;

                 case 2:
                     Scanner leer = new Scanner(System.in).useDelimiter("\n");
                     String palabra = "";  
                     String palabra_mayor = "";
                     char letra = ' ';
                     System.out.print("Ingrese Una Frase : ");
                     String frase = leer.next();

                     System.out.print("Ingrese La Longitud Minima De La Palabra : ");
                     int longitud = leer.nextInt();

                     System.out.println("Palabras Con La Longitud De : " + longitud);

                     for (int indice = 0; indice < frase.length(); indice++) {
                         palabra += frase.charAt(indice);
                         letra = frase.charAt(indice);

                         if (letra == ' ' || indice == frase.length() - 1) {
                             palabra_mayor = palabra;
                             palabra = "";

                             if (palabra_mayor.length() > longitud) {
                                 System.out.println(palabra_mayor);
                             }
                         }
                     }
                     break;

                 case 3:
                     
                     break;

                 case 4:
                     System.out.println("Abandonando el sistema... ¡Hasta pronto!");
                     break;

                 default:
                     System.out.println("Opción inválida. Intente nuevamente.");
             }

         } while (opcionMenu != 4);
     }
}
