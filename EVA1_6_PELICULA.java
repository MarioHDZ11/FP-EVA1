/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
        String Nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasificacion;
        
        Scanner Capture;
        Capture = new Scanner (System.in);
        
        System.out.println("Nombre de la pelicula:");
        Nombre = Capture.nextLine();
        System.out.println("Que genero es:");
        Genero = Capture.nextLine();
        System.out.println("Su duracion:");
        Duracion = Capture.nextInt();
        Capture.nextLine();
        System.out.println("Su reparto:");
        Reparto = Capture.nextLine();
        System.out.println("Su clasificacion:");
        Clasificacion = Capture.next();
        
        System.out.println("Datos de la pelicula------");
        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(Reparto);
        System.out.println(Clasificacion);
        
    }
    
}
