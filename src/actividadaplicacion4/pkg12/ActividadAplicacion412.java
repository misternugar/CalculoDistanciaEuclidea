/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadaplicacion4.pkg12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author angarcia
 */
public class ActividadAplicacion412 {

    //Función que calcula y devuelve la distancia euclídea//
    static double distancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
        return (distancia); //devuelve el valor de la variable distancia//
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        //ACTIVIDAD DE APLICACIÓN 4.12//
        //Declaración de variables//
        Scanner sc = new Scanner(System.in);

        double x1Programa, y1Programa, x2Programa, y2Programa;

        //Lectura de datos//
        System.out.println("Dígame el valor del punto x1: ");
        x1Programa = sc.nextDouble();

        System.out.println("Dígame el valor del punto y1: ");
        y1Programa = sc.nextDouble();

        System.out.println("Dígame el valor del punto x2: ");
        x2Programa = sc.nextDouble();

        System.out.println("Dígame el valor del punto y2: ");
        y2Programa = sc.nextDouble();

        System.out.println("La distancia euclídea que separa estos puntos es: " + distancia(x1Programa, y1Programa, x2Programa, y2Programa));

    }

}
