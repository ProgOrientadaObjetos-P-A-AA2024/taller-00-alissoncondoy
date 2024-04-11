/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje; /* Importamos el paquete 1*/
import paquete3.Informacion;
public class Demo {
    public static void main(String[] args) {
        
        String cadena = Mensaje.obtenerMensaje();
        int suma = Informacion.obtenerHabitantes();
        
        System.out.printf("%s con %d\n", cadena, suma);
        /*Llamamos a la clase mensaje */
    }
    
}
