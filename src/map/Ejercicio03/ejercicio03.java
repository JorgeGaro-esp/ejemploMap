/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map.Ejercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String frase = "Ella queria querer lo que queria pero querer no siempre es querer";
        String[] miArray = frase.split(" ");

        TreeMap<String, Integer> miMapa = new TreeMap<>();

        for (String elemento : miArray) {

            if (miMapa.containsKey(elemento)) 
            {
                miMapa.put(elemento, miMapa.get(elemento) + 1);
            } else 
            {
                miMapa.put(elemento, 1);
            }
        }

        for (Map.Entry<String, Integer> entrada : miMapa.entrySet()) 
        {
            System.out.println(entrada);
        }
    }

}
