/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje; /* Importamos el paquete 1*/
import paquete3.Informacion;
import java.util.Scanner;
public class Demo002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String cadena = Mensaje.obtenerMensaje();
        int suma = Informacion.obtenerHabitantes();
        
        String mensajeF = cadena + " con " + suma;
        
        System.out.println("Si desea que se le presente el mensaje original elija un valor del 1 al 5");
        int respuesta = teclado.nextInt();
        
        if (respuesta >= 1 && respuesta <=5){
            System.out.printf(mensajeF);
        }else{
            System.out.printf(mensajeF.toUpperCase());
            
            
        }
        

        /*Llamamos a la clase mensaje */
       
    }
    
}
