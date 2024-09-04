/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Operaciones aritméticas
        int x = 10;// declaracion y asignacion;
        int y = 5;
        // Declaracion de multiples variables del mismo tipo
        int suma, resta, div, multi, pot, raiz;
        //Suma y resta
        suma = x + y; //operacion de suma
        System.out.println("Suma de x + y:");
        System.out.println(suma);
        
        resta = x - y;//Operador de diferencia -
        System.out.println("Resta de x - y:");
        System.out.println(resta);
               
        //Multiplicacion
        multi = x * y;
        System.out.println("Multiplicacion de x * y:");
        System.out.println(multi);
                
        //Division --> el manejo de tipo de datos
        // Si dividimos enteros, Java da como resultado un entero
        div = x / y;
        System.out.println("DIvision de x(10) / y(5):");
        System.out.println(div);
        //cambiamos los valores de x y
        x = 5;
        y = 2;
        div = x / y;
        System.out.println("DIvision de x(5) / y(2):");
        System.out.println(div);
        
        double val1 = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("Division entre # decimales:");
        System.out.println(diviD);
        
    }
    
}
