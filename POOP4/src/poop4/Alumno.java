/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author sergi
 */
public class Alumno {
    String nombre;
    int edad;
    int numDeCuenta;
    String carrera;
    String tutor;
    
    public Alumno(){
        nombre = null;
        edad = 0;
        numDeCuenta = 0;
        carrera = null;
        tutor = null;
    }
    
    public Alumno(String nombre, int edad, int numDeCuenta, String carrera, String tutor){
        this.nombre = nombre;
        this.edad = edad;
        this.numDeCuenta = numDeCuenta;
        this.carrera = carrera;
        this.tutor = tutor;
    }
    
    public void imprimirAlumno(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(numDeCuenta);
        System.out.println(carrera);
        System.out.println(tutor);        
    }
    
    public void barquear(){
        System.out.println("Estoy barqueando la materia");
    }
    
    public boolean estudiar(){
        System.out.println("Estoy estudiando");
        return true;
    }
    
    public boolean cursarMaterias(){
        System.out.println("Curso 6 materias");
        return true;
    }
    
    public void tenerCreditos(){
        System.out.println("Tengo 60 creditos");
    }
    
    public boolean irASalon(float x, float y, float z){
        System.out.println("Voy al salon que esta en: "+ x +", "+ y +", " + z);
        return true;
    }
}
