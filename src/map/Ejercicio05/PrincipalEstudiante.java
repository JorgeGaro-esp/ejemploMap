/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map.Ejercicio05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalEstudiante {

    /**
     * @param args the command line arguments
     */
    static public void buscar() {

        System.out.println("Inserte el ID del alumno que quiere buscar");
        int id = in.nextInt();

        for (Map.Entry<Integer, Estudiante> entrada : estudiantes.entrySet()) {
            if (entrada.getKey() == id) {
                System.out.println("ID: " + entrada.getKey() + " Estudiante: " + entrada.getValue().toString());
                break;
            }

        }

    }

    static Map<Integer, Estudiante> estudiantes = new HashMap<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        estudiantes.put(1, new Estudiante("Jorge", 22, 10));
        estudiantes.put(2, new Estudiante("Fatma", 23, 9));
        estudiantes.put(3, new Estudiante("Luisa", 36, 7));

        for (Map.Entry<Integer, Estudiante> entrada : estudiantes.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + " Estudiante: " + entrada.getValue().toString());
        }
        
        buscar();
    }

}
