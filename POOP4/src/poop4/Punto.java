/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Guerrero Aguilar Sergio Leonardo
 */
public class Punto {
    int x;
    int y;
    String nombre;
    
    public Punto(){
    x=0;
    y=0;
    nombre=null;
}
  
public void imprimePunto(){
        System.out.println("(x="+x+", y="+y+") Nombre = "+nombre);
}

public Punto(int x, int y, String nombre){
    this.x=y;
    this.y=y;
    this.nombre=nombre;
    }
}
