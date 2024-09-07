/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_operaciones2;

/**
 *
 * @author invitado
 */
public class EVA1_8_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Mario";
        String apellido = "Hernández";
        String nombreCom;
        //Cadenas de texto, la operacion se llama Concatenacion --> Unir cadenas de texto
        //El operador de concatenacion es el "+". 
        //Cuando un simbolo tiene varias fincuiones, se le llama sobrecarga (de operadores)
        nombreCom = nombre + " " + apellido;
        
        System.out.println("El nombre es:" + nombre);
        System.out.println("EL apellido es:" + apellido);        
        System.out.println("EL nombre completo es:" + nombreCom);
        
        
    }
    
}
