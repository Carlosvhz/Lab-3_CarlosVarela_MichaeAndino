package laboratorio.pkg3;

import java.util.*;

public class Raza extends integrantes {

    private String tipo, arma;
    private ArrayList<String> accesorio = new ArrayList();
    private Raza hermano;
    private boolean hermanoya;

    public Raza() {
    }

    public Raza(String tipo, String arma, String nombre, String apellido, int Altura, Date fecha, Bestia bestia, int poder, int curacion, int defensa, int vida) {
        super(nombre, apellido, Altura, fecha, bestia, poder, curacion, defensa, vida);
        this.tipo = tipo;
        this.arma = arma;
        AsignarAtributosBasicos();
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setAccesorio(String accesorio) {
        this.accesorio.add(accesorio);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void AsignarAtributosBasicos() {
        if (tipo.equals("Elfo")) {
            curacion += 335;
            defensa += 150;
            poder += 443;
            if (arma.equals("Si")) {
                curacion += 10;
                defensa += 10;
                poder += 10;
            }
        }
        if (tipo.equals("Enano")) {
            this.curacion += 50;
            this.defensa += 200;
            this.poder += 300;
            if (accesorio.get(0).equals("Barba")) {
                this.curacion += 50;
                this.defensa += 50;
                this.poder += 50;
            }
            if (arma.equals("Hacha")) {
                this.poder += 50;
            }
        }
        if (tipo.equals("Hobbit")) {
            this.curacion += 1;
            this.defensa += 100;
            this.poder += 10;
            for (int i = 0; i < Integer.parseInt(arma); i++) {
                this.curacion += 40;
                this.defensa += 40;
                this.poder += 40;
            }
        }
        if (tipo.equals("Hombre")) {
            this.curacion += 50;
            this.defensa += 140;
            this.poder += 150;
            if (arma.equals("Espada")) {
                this.poder += 150;
            } else if (arma.equals("Lanza")) {
                this.poder += 100;
            } else if (arma.equals("arco")) {
                this.poder += 100;
            }
        }
        if (tipo.equals("Maiar")) {
            if (accesorio.get(0).equals("Sombrero")) {
                this.curacion += 200;
                this.poder += 200;
            }
            if (arma.equals("Baston")) {
                this.curacion += 250;
                this.poder += 200;
            }
        }
    }
}
