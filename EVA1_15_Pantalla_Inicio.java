/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_15_Pantalla_Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Constantes 
        final String USUARIO = "Admin";
        final String CONTRASEÑA = "Admin";
        //final double PI = 3.1416;
        
        String User;
        String Contra;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Usuario:");
        User = cap.nextLine();
        System.out.println("Contraseña:");
        Contra = cap.nextLine();
        
        //Como validamos el acceso?
        if(Contra.equals(CONTRASEÑA) && User.equals(USUARIO) ){
         System.out.println("Acceso Concedido!!");
        }else{
            System.out.println("Acceso Denegado!!");
        }      
        
                
      
    }
    
}
