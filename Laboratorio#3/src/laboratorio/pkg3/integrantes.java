/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg3;
import java.util.*;
/**
 *
 * @author carlo
 */
public class integrantes {
    protected String nombre, apellido;
    protected int Altura, poder, curacion, defensa;
    protected Date fecha;
    protected Bestia bestia;
    
    //Bestia agregar despues.
    public integrantes(String nombre, String apellido, int Altura, Date fecha) {
        //this.bestia = bestia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Altura = Altura;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /*public Bestia getBestia() {
        return bestia;
    }

    public void setBestia(Bestia bestia) {
        this.bestia = bestia;
    }*/
    
    
}
