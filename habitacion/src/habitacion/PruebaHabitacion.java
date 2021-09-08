/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitacion;


public class PruebaHabitacion {

    
    public static void main(String[] args) {
    Habitacion h = new Habitacion();
        h.setAltura(5);
        h.setAncho(6);
        h.setLargo(8);
        System.out.println("M^2 para enchapar el piso: " + h.calcularEnchape() +" m");
        System.out.println("M^2 para tapizar paredes: " + h.calcularTapiz() + " m");
    }
    
}
