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
        int opcion = 0;

        String palabra = "";
        String par = "";
        String impar = "";
        int numero_par = 0;
        int numero_impar = 0;
        String palabras_juntas = "";
        String palabra_og = "";

        while (opcion != 3) {

            System.out.println("[1]-Encriptar Texto");
            System.out.println("[2]-Desencriptar Texto");
            System.out.println("[3]-Regresar");
            System.out.print("Que Opcion Desea (1,2 o 3) : ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese Una Palabra : ");
                    palabra = leer.next();

                    for (int indice = 0; indice < palabra.length(); indice++) {
                        if (indice % 2 == 0) {
                            par += palabra.charAt(indice);
                        } else {
                            impar += palabra.charAt(indice);
                        }
                    }

                    palabras_juntas = par + impar;
                    System.out.println(palabras_juntas);
                    par = "";
                    impar = "";
                    break;

                case 2:
                    System.out.print("Ingrese Una Palabra : ");
                    palabra = leer.next();
                    int mitad = (palabra.length()+1)/2;
                    palabra_og="";
                    
                    int pospar=0;
                    int posimpar=mitad;
                    
                    for (int indice = 0; indice < palabra.length(); indice++) {
                        if (indice % 2 == 0&&pospar<mitad) {
                            palabra_og+=palabra.charAt(pospar);
                            pospar++;
                        } else {
                            palabra_og+=palabra.charAt(posimpar);
                            posimpar++;
                        }
                    }

                    System.out.println(palabra_og);

                    break;

                default:
                    System.out.println("Esta Opcion No Existe");
                    break;
            }

        }
    }
}
