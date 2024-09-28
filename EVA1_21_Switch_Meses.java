/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_21_switch_meses;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_21_Switch_Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Numero correspondiente al mes (1 - 12)");
        mes = cap.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("Enero");
                break; // Ultima instruccion - Fin del caso
            case 2:
                System.out.println("Febrero");
                break; // Ultima instruccion - Fin del caso
            case 3:
                System.out.println("Marzo");
                break; // Ultima instruccion - Fin del caso
            case 4:
                System.out.println("Abril");
                break; // Ultima instruccion - Fin del caso
            case 5:
                System.out.println("Mayo");
                break; // Ultima instruccion - Fin del caso
            case 6:
                System.out.println("Junio");
                break; // Ultima instruccion - Fin del caso
            case 7:
                System.out.println("Julio");
                break; // Ultima instruccion - Fin del caso
            case 8:
                System.out.println("Agosto");
                break; // Ultima instruccion - Fin del caso
            case 9:
                System.out.println("Septiembre");
                break; // Ultima instruccion - Fin del caso
            case 10:
                System.out.println("Octubre");
                break; // Ultima instruccion - Fin del caso
            case 11:
                System.out.println("Noviembre");
                break; // Ultima instruccion - Fin del caso
            case 12:
                System.out.println("Diciembre");
                break; // Ultima instruccion - Fin del caso

                default: // Opcional, sin Break , Ultima seccion del Switch 
        System.out.println("Numero del mes no valido(deben ser entre el 1 - 12)");
        }
    }
    
}
