/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map.Ejercicio03;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
        String[] palabraArray = frase.split(" ");

        LinkedHashMap<String, Integer> palabraMap = new LinkedHashMap<>();

        for (String elemento : palabraArray) {

            if (palabraMap.containsKey(elemento)) 
            {
                palabraMap.put(elemento, palabraMap.get(elemento) + 1);
            } else 
            {
                palabraMap.put(elemento, 1);
            }
        }

        for (Map.Entry<String, Integer> entrada : palabraMap.entrySet()) 
        {
            System.out.println(entrada);
        }
    }

}
