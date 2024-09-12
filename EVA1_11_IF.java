/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        // Condiconal 
        // Logica Booleana --> Operaciones de verdadero y falso
        // Solicitar la edad en años
        int Edad;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("Caprtura la edad:");
        Edad = captu.nextInt();

        //Determinar si es un adulto o no 
        // Las opercaione logicas solo generan como resultado un verdadero o un falso
        // Si son varias intrucciones, hay que argrupar con llave {}
        if(Edad >= 18){//Bloque para el verdadero
        System.out.println("Es un adulto");
       } else{ // Bloque para el falso opcional
            System.out.println("Menor de edad!!");
        }
        }
    }
    

