/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Perro {
    String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;
    
    public Perro(){
        color= null;
        pelaje= null;
        tamaño=0;
        raza= null;
        edad= 0;
    }
    
    public Perro(String color, String pelaje, int tamaño, String raza, int edad){
        this.color=color;
        this.pelaje=pelaje;
        this.tamaño=tamaño;
        this.raza=raza;
        this.edad=edad;
    }
    public void imprimirPerro(){
        System.out.println(color);
        System.out.println(pelaje);
        System.out.println(tamaño);
        System.out.println(raza);
        System.out.println(edad);        
    }
    
    public void jugar(){
        System.out.println("wuau wuau");
    }
    public boolean comer(){
        System.out.println("Estoy comiendo");
        return true;
    }
    public void correr(){
        System.out.println("corro");
    }
    public void morder(){
        System.out.println("grrrrrr");
    }
    public void saltar(float x, float y, float z){
        System.out.println("me movi a: "+x+", "+ y +", "+z);
    }
}
