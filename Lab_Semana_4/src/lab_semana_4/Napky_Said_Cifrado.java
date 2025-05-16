/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_semana_4;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
import java.util.Scanner;

public class Napky_Said_Cifrado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
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
        
        sc.close(); 
    }
}


