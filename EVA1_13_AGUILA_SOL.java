/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_aguila_sol;

/**
 *
 * @author invitado
 */
public class EVA1_13_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aleatorio. Generar numeros aleatorios
        double valor = Math.random();
        //random genera valores >= 0 y < a 1
        // entre 0 y .999999999999
        // 0 1 2 3 _4_ < 5 6 7 8 9
        if( valor < 0.5){
            System.out.println("AGUILA");
        }else{
            System.out.println("SOL");
        } 
           
            
    }
    
}
