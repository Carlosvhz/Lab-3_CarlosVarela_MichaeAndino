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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DateFormat df = SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Carlos sos guapo.");
        System.out.println("Hola pinche putita");
        Date fecha = new Date();
        Pueblos p = new Pueblos();
        p.setIntegrantes(new Raza("Hombre", "Nada", "Nada", "Putin", "x'D", 1, fecha));
        System.out.println( ((Raza)p.getIntegrantes().get(0)).getCuracion() );
    }
    
}
