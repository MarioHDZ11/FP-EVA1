/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entradas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADAS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaramos variables
        String marca;
        String modelo;
        int year;
        double precio;
        // ¿Como se captura?
        // Scanner
        // Herramienta --> clase: nos proporcionan muchas herramientas
        Scanner captura; // Hay que importarla (hacer un import)
        captura = new Scanner (System.in);// Creamos la herramienta 
        
        // Hay que indicarle al usuario capturar
        System.out.println("Introduce la marca del vehiculo:");
        // Capturamos --> una asignacion 
        marca = captura.nextLine(); // Les regresa todo el texto haste que se preciona "enter"
        System.out.println("Introduce el modelo del vehiculo:");
        modelo = captura.nextLine();
        System.out.println("INtroduce el año:");
        year = captura.nextInt();
        System.out.println("introduce el precio:");
        precio = captura.nextDouble();
        
        System.out.println("Datos capturados--------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
        
    }
    
}
