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
public class Raza extends integrantes{
    
    private String tipo, arma, accesorio;
    private int poder, curacion, defensa;
    public Raza(String tipo) {
        this.tipo = tipo;
    }

    public Raza(int vida, int curacion, int defensa, String nombre, String apellido, int Altura, Date fecha,/* Bestia bestia,*/ Raza raza, String accesorio) {
        super(nombre, apellido, Altura, fecha, raza);
        this.poder = poder;
        this.curacion = curacion;
        this.defensa = defensa;
        this.accesorio = accesorio;
        AsignarAtributosBasicos();
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setAccesorio(String accesorio) {
        this.accesorio = accesorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getpoder() {
        return poder;
    }

    public void setpoder(int poder) {
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
    
    public void AsignarAtributosBasicos(){
        if (tipo.equals("Elfos")) {
            this.curacion = 335;
            this.defensa = 150;
            this.poder = 443;
        }if (tipo.equals("Enanos")) {
            this.curacion = 50;
            this.defensa = 200;
            this.poder = 300;
        }if (tipo.equals("Hobbit")) {
            this.curacion = 1;
            this.defensa = 100;
            this.poder = 10;  
        }if (tipo.equals("Hombres")) {
            this.curacion = 50;
            this.defensa = 140;
            this.poder = 150;
        }if (tipo.equals("Maiar")) {
            this.defensa = 0;
            if (accesorio.equalsIgnoreCase("Sombrero")) {
                
            }
        }
    }
}
