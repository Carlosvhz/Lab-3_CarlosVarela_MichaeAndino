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

    public Raza(String tipo, String arma, String accesorio, String nombre, String apellido, int Altura, Date fecha) {
        super(nombre, apellido, Altura, fecha);
        this.tipo = tipo;
        this.arma = arma;
        this.accesorio = accesorio;
        AsignarAtributosBasicos();
    }

    

    public String getRaza() {
       return tipo;
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
        if (tipo.equals("Elfo")) {
            if (arma.equalsIgnoreCase("Si")) {
                this.curacion = 335+10;
                this.defensa = 150+10;
                this.poder = 443+10;
            }else{
                this.curacion = 335;
                this.defensa = 150;
                this.poder = 443;
            }
        }if (tipo.equals("Enano")) {
            this.curacion = 50;
            this.defensa = 200;
            this.poder = 300;
        }if (tipo.equals("Hobbit")) {
            this.curacion = 1;
            this.defensa = 100;
            this.poder = 10;  
        }if (tipo.equals("Hombre")) {
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
