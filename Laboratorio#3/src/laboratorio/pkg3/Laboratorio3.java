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


    static int simulacion, opcion;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<integrantes> integ = new ArrayList();
    static Pueblos p = new Pueblos();
    static Random rn = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DateFormat df = SimpleDateFormat("yyyy/MM/dd");
        do {
            
            System.out.print("______Lab#3_____\n"
                    + "1. Añadir integrantes\n"
                    + "2. Eliminar integrantes\n"
                    + "3. Modificar integrantes\n"
                    + "4. Iniciar Simulación pueblos\n"
                    + "5. Iniciar Simulación Lugares\n"
                    + "6. Salir\n"
                    + "Ingrese opcion: ");
            opcion = sc.nextInt();
            menu(opcion);
        } while (opcion<6);
    }
    
    static public void menu(int simulacion){
        switch (opcion) {
            case 1:
                System.out.println("-- Añadir integrantes --");
                añadir();
                break;
            case 2:
                
                break;
            case 3:
                
                break;   
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            default:
                break;
        }
    }
    
    static public void añadir(){
        String nombre, apellido, raza, respuesta;
        int altura;
        Date fecha = new Date();
        System.out.println("... Añadiendo bestia\n"
                + "Ingrese");
        System.out.print("- Añadir nombre: ");
        nombre = sc.next();
        System.out.print("- Añadir apellido: ");
        apellido = sc.next();
        System.out.print("- Añadir altura: ");
        altura = sc.nextInt();
        System.out.print("- Añadir fecha: \n");
        
        System.out.print("¿Que raza sera su integrante?\n"
                + "1. Elfo\n"
                + "2. Enano\n"
                + "3. Hobbit\n"
                + "4. Hombre\n"
                + "5. Maiar\n"
                + "Ingrear opcion: ");
        opcion = sc.nextInt();
        while(opcion<0||opcion>5){
            System.out.print("... Ingrese solo opciones validas: ");
            opcion = sc.nextInt();
        }
        switch(opcion){
            case 1: //ELFOS
                System.out.print("¿Contara con un arma?[Si/No]: ");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("Si")) {
                    p.integrantes.add(new Raza("Elfo", "Si", "Nada", nombre, apellido, altura, fecha));
                }else{
                    p.integrantes.add(new Raza("Elfo", "No", "Nada", nombre, apellido, altura, fecha));
                }
                break;
                
            case 2://ENANOS
                break;    
            case 3://
                break;
            case 4:
                break;
            case 5:
                break;    
        }
    }
}
