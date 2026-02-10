/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map.Ejercicio01;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Contacto {

    private String nombre;
    private String correo;
    
    //Constructor

    public Contacto(String nombre, String correo) {

        this.nombre = nombre;
        this.correo = correo;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Metodos

    @Override
    public String toString() {
        return " Nombre: " + nombre  + " Correo: " + correo;
    }
    
    
}
