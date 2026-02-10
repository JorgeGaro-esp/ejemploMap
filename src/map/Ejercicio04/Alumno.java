/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map.Ejercicio04;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Alumno {
    private String dni;
    private String nombre;
    
    //Constructor

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    //Getter and Setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Dni:" + dni + ", Nombre:" + nombre;
    }
    
}
