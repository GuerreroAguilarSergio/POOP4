/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author Guerrero Aguilar Sergio Leonardo
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punto punto = new Punto();
        punto.imprimePunto();
        Punto punto2 = new Punto(1, 2, "punto 2");
        punto2.imprimePunto();
        
        punto.x=20;
        punto.y=100;
        punto.nombre="punto 1";
        punto.imprimePunto();
        System.out.println(punto);
        
        /*Perro perro = new Perro();
        perro.imprimirPerro();*/
        
        Perro perro2 = new Perro("cafe", "chino", 20, "chihuahua", 5);
        perro2.imprimirPerro();  
        
        perro2.jugar();
        perro2.saltar(3.5f, 7, 9);
        
        /*Carro carro = new Carro();
        carro.imprimirCarro();*/
        
        System.out.println("--------------");
        
        Carro carro2 = new Carro("Nissan", "Sentra", 2018, "V4", 5);
        carro2.imprimirCarro();
        carro2.transportar(8, 9, 19);
        carro2.iluminar();        
        carro2.atropellar();
        carro2.sonar();
        carro2.encender();
        
        System.out.println("--------------");
        
        /*Alumno alumno = new Alumno();
        alumno.imprimirAlumno();*/
        
        Alumno alumno2 = new Alumno("Sergio", 19, 321232137, "Ing. En Computacion", "Orlando Zaldivar");
        alumno2.imprimirAlumno();
        alumno2.barquear();
        alumno2.estudiar();        
        alumno2.cursarMaterias();
        alumno2.tenerCreditos();
        alumno2.irASalon(8, 10, 34);
        
        System.out.println("---------------");
        
        Profesor profesor2 = new Profesor("Joel", 75, "Lunes y martes de 7am a 9am", "Ing. Mecanico", "Calculo Integral");
        profesor2.imprimirProfesor();
        profesor2.barquear();
        profesor2.calificar();        
        profesor2.regañar();
        profesor2.escribir();
        profesor2.asesorar();
        
        System.out.println("----------------");
        
        Triangulo triangulo = new Triangulo(3, 3, 3, 5.6f, "azul");
        triangulo.imprimirTriangulo();
        triangulo.dividir();
        triangulo.obtenerAngulos();
        triangulo.formarFiguras();
        triangulo.sacarArea();               
        triangulo.jugar();
                
        
    }
}
