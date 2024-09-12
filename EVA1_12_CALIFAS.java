/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar variable para la calificacion. Evaluar si acreditas (mayor o igual a 70)
        //O no acreditas (NA--> menor a 70)
        int Califa;
        
        Scanner captu = new Scanner (System.in);
        System.out.println("Calificacion:");
        Califa = captu.nextInt();

        //Determinar si es un adulto o no 
        // Las opercaione logicas solo generan como resultado un verdadero o un falso
        // Si son varias intrucciones, hay que argrupar con llave {}
        if(Califa >= 70){//Bloque para el verdadero
        System.out.println("Aprobado");
       } else{ // Bloque para el falso opcional
            System.out.println("NA");
        }
        }
    }
    

