package laboratorio.pkg3;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Laboratorio3 {

    static int simulacion, opcion, altura, garras, vida;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<integrantes> integ = new ArrayList();
    static Pueblos p = new Pueblos();
    static Random rn = new Random();
    static String nombre, apellido, raza, respuesta, cantidad;

    public static void main(String[] args) throws ParseException {
        do {

            System.out.print("______Lab#3_____\n"
                    + "1. Añadir integrantes\n"
                    + "2. Eliminar integrantes\n"
                    + "3. Modificar integrantes\n"
                    + "4. Iniciar Simulación pueblos\n"
                    + "5. Iniciar Simulación Lugares\n"
                    + "6. Listar Integrantes\n"
                    + "7. Salir\n"
                    + "Ingrese opcion: ");
            opcion = sc.nextInt();
            menu(opcion);
        } while (opcion < 6);
    }

    static public void menu(int simulacion) throws ParseException {
        switch (opcion) {
            case 1:
                System.out.println("-- Añadir integrantes --");
                añadir();
                break;
            case 2:
                System.out.println("-- Eliminar --");
                if (p.integrantes.size() > 0) {
                    System.out.println("¿Que integrante desea eliminar?");
                    opcion = sc.nextInt();
                    while (opcion < 0 || opcion > p.integrantes.size()) {
                        System.out.print("... Ingrese numero de usuarios existentes: ");
                        opcion = sc.nextInt();
                    }
                    p.integrantes.remove(opcion);
                } else {
                    System.out.println("... No hay integrantes para eliminar");
                }
                break;
            case 3:
                System.out.println("-- Modificar --");
                modificar();
                break;
            case 4:
                System.out.println("... No realizado :(");
                break;
            case 5:
                System.out.println("... No realizado :(");
                break;
            case 6:
                System.out.println(p.integrantes.toString());
        }
    }

    static public void añadir() throws ParseException {
        String nombre, apellido, raza, respuesta, cantidad;
        int altura, garras, vida;
        boolean venenoso = false;
        Bestia b = new Bestia();
        System.out.print("... Añadiendo bestia\n"
                + "- Ingrese numero de garras: ");
        garras = sc.nextInt();
        while (garras<1||garras>6) {
            System.out.println("Numero Invalido");
            garras = sc.nextInt();
        }
        vida = rn.nextInt(101) + 50;
        System.out.print("- Ingrese vida: " + vida+"\n");
        System.out.print("- Sera venenoso? [s/n]:");
        if (sc.next().toLowerCase().charAt(0) == 's') {
            venenoso = true;
        }
        System.out.print("¿Que raza sera su integrante?\n"
                + "1. Aguillas\n"
                + "2. Arañas\n"
                + "3. Balrogs\n"
                + "4. Bestias Aladas\n"
                + "5. Dragon\n"
                + "Ingrear opcion: ");
        int tipo = sc.nextInt();
        while (tipo < 1 || tipo > 5) {
            System.out.print("... Ingrese solo opciones validas: ");
            opcion = sc.nextInt();
        }
        switch (tipo) {
            case 1:
                Color c = Color.BLACK;
                System.out.print("¿Que color le dara al plumaje?\n"
                        + "1. Blanco\n"
                        + "2. Negro\n"
                        + "3. Rojo\n"
                        + "Ingrear opcion: ");
                int color = sc.nextInt();
                while (color < 1 || color > 3) {
                    System.out.print("... Ingrese solo opciones validas: ");
                    color = sc.nextInt();
                }
                switch (color) {
                    case 1:
                        c = Color.WHITE;
                        break;
                    case 2:
                        c = Color.BLACK;
                        break;
                    case 3:
                        c = Color.RED;
                        break;
                }
                b = new Aguilas(c, garras, venenoso, vida);
                break;
            case 2:
                char sexo = 'b';
                System.out.print("¿Que sexo tendra la araña?\n"
                        + "2. Masculino\n"
                        + "2. Femenino\n"
                        + "Ingrear opcion: ");
                int arañon = sc.nextInt();
                while (arañon < 1 || arañon > 2) {
                    System.out.print("... Ingrese solo opciones validas: ");
                    arañon = sc.nextInt();
                }
                switch (arañon) {
                    case 1:
                        sexo = '♂';
                        break;
                    case 2:
                        sexo = '♀';
                        break;
                }
                b = new Arañas(sexo, garras, venenoso, vida);
                break;
            case 3:
                boolean latigo = false;
                System.out.print("Desea añadirle un latigo? [s/n]: ");
                if (sc.next().toLowerCase().charAt(0) == 's') {
                    latigo = true;
                }
                b = new Balrogs(latigo, garras, venenoso, vida);
                break;
            case 4:
                System.out.print("Ingrese su velocidad m/s: ");
                int velocidad = sc.nextInt();
                b = new Aladas(velocidad, garras, venenoso, vida);
                break;
            case 5:
                System.out.print("Ingrese la longitud de alas: ");
                int longitud = sc.nextInt();
                b = new Dragones(longitud, garras, venenoso, vida);
                break;
        }
        //Asignar bestia
        System.out.print("- Añadir nombre: ");
        nombre = sc.next();
        System.out.print("- Añadir apellido: ");
        apellido = sc.next();
        System.out.print("- Añadir altura: ");
        altura = sc.nextInt();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ingrese la fecha de nacimiento. dd/MM/yyyy ");
        String date=sc.next();
        Date fecha=df.parse(date);
        System.out.print("¿Que raza sera su integrante?\n"
                + "1. Elfo\n"
                + "2. Enano\n"
                + "3. Hobbit\n"
                + "4. Hombre\n"
                + "5. Maiar\n"
                + "Ingrear opcion: ");
        opcion = sc.nextInt();
        while (opcion < 0 || opcion > 5) {
            System.out.print("... Ingrese solo opciones validas: ");
            opcion = sc.nextInt();
        }
        switch (opcion) {
            case 1: //ELFOS
                System.out.print("¿Contara con un arma?[Si/No]: ");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("Si")) {
                    p.integrantes.add(new Raza("Elfo", "Si", nombre, apellido, altura, fecha, b, 0, 0, 0, vida));
                } else {
                    p.integrantes.add(new Raza("Elfo", "No", nombre, apellido, altura, fecha, b, 0, 0, 0, vida));
                }
                System.out.println("  ¡Integrante añadido!  ");
                break;

            case 2://ENANOS
                break;

            case 3://Hobbits
                System.out.print("¿Cuantos anillos tiene el hobbit?: ");
                cantidad = sc.next();
                p.integrantes.add(new Raza("Hobbit", cantidad, nombre, apellido, altura, fecha, b, 0, 0, 0, vida));
                break;
            case 4://Humanos
                System.out.print("¿Contara con un arma?[Si/No]: ");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("Si")) {
                    String arma = "";
                    System.out.print("¿Cual arma posera?\n"
                            + "1. Espada\n"
                            + "2. Lanza\n"
                            + "3. Arco\n"
                            + "Ingrear opcion: ");
                    int opcion2 = sc.nextInt();
                    while (opcion < 1 || opcion > 3) {
                        System.out.print("... Ingrese solo opciones validas: ");
                        opcion = sc.nextInt();
                    }
                    switch (opcion2) {
                        case 1:
                            arma = "Espada";
                            break;
                        case 2:
                            arma = "Lanza";
                            break;
                        case 3:
                            arma = "Arco";
                            break;
                    }
                    p.integrantes.add(new Raza("Hombre", arma, nombre, apellido, altura, fecha, b, 0, 0, 0, vida));
                } else {
                    p.integrantes.add(new Raza("Hombre", "", nombre, apellido, altura, fecha, b, 0, 0, 0, vida));
                }
                System.out.println("  ¡Integrante añadido!  ");
                break;
            case 5://Copiar
                System.out.print("¿Tendra Baston?[Si/No]: ");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("Si")) {
                    p.integrantes.add(new Raza("Maiar", "Baston", nombre, apellido, altura, fecha, b, 0, 0, 0, 0));
                } else {
                    System.out.print("¿Tendra Sombrero?[Si/No]: ");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("Si")) {
                        p.integrantes.add(new Raza("Maiar", "Sombrero", nombre, apellido, altura, fecha, b, 0, 0, 0, 0));
                    } else {
                        p.integrantes.add(new Raza("Maiar", "", nombre, apellido, altura, fecha, b, 0, 0, 0, 0));
                    }
                }
                break;
        }
    }

    public static void modificar() {
        int cual;

        if (p.integrantes.size() > 0) {
            System.out.println("... Listado de integrantes\n");
            for (integrantes object : integ) {
                System.out.println(object);
            }
            System.out.print("Ingrese el numero de integrante a modificar: ");
            cual = sc.nextInt();
            while (cual < 0 || cual > p.integrantes.size()) {
                System.out.println("... Ingrese solamente posiciones existentes. ");
            }
            System.out.print("- Ingrese nombre: ");
            nombre = sc.next();
            p.integrantes.get(cual).setNombre(nombre);
        }
    }
}
