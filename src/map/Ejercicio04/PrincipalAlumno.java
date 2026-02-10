/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map.Ejercicio04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String,List<Alumno>> alumnosMap = new HashMap<>();
        List<Alumno> alumnosList = new ArrayList<Alumno>();
        
        alumnosList.add(new Alumno("58443472N","Jorge"));
        alumnosList.add(new Alumno("58443473J","Marta"));
        alumnosList.add(new Alumno("58443474R","Marina"));
        alumnosList.add(new Alumno("58443475E","Roberto"));
        
        alumnosMap.put("DAM1",alumnosList);
        
        for (Map.Entry<String,List<Alumno>> entrada: alumnosMap.entrySet()) {
            System.out.println("Alumnado de " + entrada.getKey() + ": " + alumnosMap.get(entrada.getKey()));
        }
        
    }
    
}
