/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Elizabeth
 */
public class Laboratorio3 {
    static Pueblos p =new Pueblos();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        añadirIntegrante();
    }

    private static void añadirIntegrante() {
       p.setIntegrantes(new Raza("Hobbit", "nada", "Frodo", "Baggins", 10, new Date(), new Arañas('♀',5,true,50), 0, 0, 0, 30));
    }
    
}
