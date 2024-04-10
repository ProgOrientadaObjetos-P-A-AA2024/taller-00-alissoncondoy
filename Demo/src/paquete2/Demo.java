/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete3.Informacion;
import paquete4.Palabra;
public class Demo {
    public static void main(String[] args) {
        String cadena = Palabra.obtenerPalabra();
        int suma = Informacion.obtenerHabitantes();
        
        System.out.printf("%s, una ciudad llena de arte y naturaleza con %d\n", cadena, suma);
    }
    
}
