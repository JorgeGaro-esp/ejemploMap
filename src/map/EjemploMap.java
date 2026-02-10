/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class EjemploMap {

    /**
     * @param args the command line arguments
     */
    static public void añadirPersona(Integer clave, String nombre) {

        if (!personas.containsKey(clave)) {
            personas.put(clave, nombre);
        } else {
            System.out.println("Esa persona ya existe");
        }
    }

    static Map<Integer, String> personas = new HashMap<>();

    public static void main(String[] args) {
        // TODO code application logic here

        añadirPersona(1, "Andres");
        añadirPersona(13, "Pablo");
        añadirPersona(2, "Pedro");
        añadirPersona(5, "Ana");
        añadirPersona(4, "David");

        for (Map.Entry<Integer, String> entrada : personas.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " Valor: " + entrada.getValue());
        }

        System.out.println("");
        añadirPersona(2, "Pepito");

        for (Map.Entry<Integer, String> entrada : personas.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " Valor: " + entrada.getValue());
        }

    }

}
