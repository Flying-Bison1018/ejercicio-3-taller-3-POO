/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habitacion;

/**
 *
 * @author PC
 */
public class Habitacion {
   private float largo;
    private float ancho;
    private float altura;

    public Habitacion(){
	this.largo = 0;
	this.ancho = 0;
	this.altura = 0;
    }
    
    public float getLargo(){
        return largo;
    }
    public void setLargo(float largo){
        this.largo = largo;
    }
    public float getAncho(){
        return ancho;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float calcularEnchape(){
        float metrosEnchape = this.ancho * this.largo;
        return metrosEnchape;
    }
    
    public float calcularTapiz(){
        float metrosTapiz = this.ancho * this.ancho;
        return metrosTapiz;
    } 
}
