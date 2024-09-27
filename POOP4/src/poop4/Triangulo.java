/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author sergi
 */
public class Triangulo {
    int lados;
    int vertices;
    int aristas;
    float altura;
    String color;
    
    public Triangulo(){
        lados = 0;
        vertices = 0;
        aristas = 0;
        altura = 0;
        color = null;
    }
    
    public Triangulo(int lados, int vertices, int aristas, float altura, String color){
        this.lados = lados;
        this.vertices = vertices;
        this.aristas = aristas;
        this.altura = altura;
        this.color = color;
    }
    
    public void imprimirTriangulo(){
        System.out.println(lados);
        System.out.println(vertices);
        System.out.println(aristas);
        System.out.println(altura);
        System.out.println(color);        
    }
    
    public void dividir(){
        System.out.println("Me hago en trianqulos mas chiquitos");
    }
    
    public boolean obtenerAngulos(){
        System.out.println("Mis angulos internos siempre forman 180 grados");
        return true;
    }
    
    public boolean formarFiguras(){
        System.out.println("Puedo formar figuras");
        return true;
    }
    
    public void sacarArea(){
        System.out.println("Mi area es base por altura sobre dos");
    }
    
    public void jugar(){
        System.out.println("Sirvo para hacer juegos de mesa");
    }
}
