/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author sergi
 */
public class Carro {
    String marca;
    String modelo;
    int anio;
    String motor;
    int puertas;
    
    public Carro(){
        marca = null;
        modelo = null;
        anio = 0;
        motor = null;
        puertas = 0;
    }
    
    public Carro(String marca, String modelo, int anio, String motor, int puertas){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.puertas = puertas;
    }
    
    public void imprimirCarro(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(anio);
        System.out.println(motor);
        System.out.println(puertas);        
    }
    
    public void transportar(float x, float y, float z){
        System.out.println("Avance a: " + x +", "+ y +", " + z);
    }
    
    public void iluminar(){
        System.out.println("Luces Encendidas");
    }
    
    public boolean atropellar(){
        System.out.println("Ruuun");
        return true;
    }
    
    public void sonar(){
        System.out.println("Pi Pi Pi");
    }
    
    public boolean encender(){
        System.out.println("Estoy encendido");
        return true;
    }
    
    
}
