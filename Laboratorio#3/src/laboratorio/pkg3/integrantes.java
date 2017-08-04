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
    protected int Altura;
    protected Date fecha;
    protected Bestia bestia;
    protected int poder, curacion, defensa, vida;
    
    
    public integrantes() {
    }

    public integrantes(String nombre, String apellido, int Altura, Date fecha, Bestia bestia,  int poder, int curacion, int defensa, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Altura = Altura;
        this.fecha = fecha;
        this.bestia = bestia;
        this.poder = poder+bestia.getVida();
        this.curacion = curacion+bestia.getVida();
        this.defensa = defensa+bestia.getVida();
        this.vida = vida;
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

    public Bestia getBestia() {
        return bestia;
    }

    public void setBestia(Bestia bestia) {
        this.bestia = bestia;
    }    

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
