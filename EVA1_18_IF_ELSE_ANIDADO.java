/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_18_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Numero correspondiente al dia (1 - 7)");
        dia = cap.nextInt();
        
        if(dia == 1){
            System.out.println("Lunes");
        }else if(dia == 2){
             System.out.println("Martes");
        }else if(dia == 3){
             System.out.println("Miercoles");
        }else if(dia == 4){
             System.out.println("Jueves");
        }else if(dia == 5){
             System.out.println("Viernes");
        }else if(dia == 6){
             System.out.println("Sabado");
        }else if(dia == 7){
             System.out.println("Domingo");
             // SEleccion opcional
        }else {
            System.out.println("Numero de dia no valido(deben ser entre el 1 - 7)");
        }
        
    }
    
}
