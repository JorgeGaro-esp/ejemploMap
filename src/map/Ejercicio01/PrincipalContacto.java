/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map.Ejercicio01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalContacto {

    /**
     * @param args the command line arguments
     */
    
    static public void añadirMap(String clave, Contacto contaco) 
    {    
        if (!contactos.containsKey(clave)) 
        {
            contactos.put(clave, contaco);
        } else 
        {
            System.out.println("El telefono ya existe");
        }
    }

    static public void buscarMap() 
    {    
        System.out.println("Que telefono quiere buscar");
        String telefono = in.next();

        for (Map.Entry<String, Contacto> entrada : contactos.entrySet()) 
        {
            if (entrada.getKey().equalsIgnoreCase(telefono)) 
            {
                System.out.println("Telefono: " + entrada.getKey() + entrada.getValue().toString());
                break;
            }
        }
    }

    static Scanner in = new Scanner(System.in);
    static Map<String, Contacto> contactos = new HashMap<>();

    public static void main(String[] args) {
        // TODO code application logic here

        añadirMap("644396965", new Contacto("Jorge", "h95jorgaro@gmail.com"));
        añadirMap("123456789", new Contacto("Luisa", "f78luisi@gmail.com"));
        añadirMap("987654321", new Contacto("Pepe", "p19pepio@gmail.com"));

        for (Map.Entry<String, Contacto> entrada : contactos.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + entrada.getValue().toString());
        }
        
        buscarMap();

    }

}
