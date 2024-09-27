/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author sergi
 */
public class Profesor {
    String nombre;
    int edad;
    String horario;
    String carrera;
    String materia;
    
    public Profesor(){
        nombre = null;
        edad = 0;
        horario = null;
        carrera = null;
        materia = null;
    }
    
    public Profesor(String nombre, int edad, String horario, String carrera, String materia){
        this.nombre = nombre;
        this.edad = edad;
        this.horario = horario;
        this.carrera = carrera;
        this.materia = materia;
    }
    
    public void imprimirProfesor(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(horario);
        System.out.println(carrera);
        System.out.println(materia);        
    }
    
    public void barquear(){
        System.out.println("Barqueo la materia");
    }
    
    public boolean calificar(){
        System.out.println("Estoy calificando");
        return true;
    }
    
    public boolean regañar(){
        System.out.println("Ta, ta, ta ,ta TA!!");
        return true;
    }
    
    public void escribir(){
        System.out.println("Anoto en el pizarron");
    }
    
    public boolean asesorar(){
        System.out.println("Me gusta asesorar alumnos");
        return true;
    }
}
