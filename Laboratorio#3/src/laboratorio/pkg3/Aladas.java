package laboratorio.pkg3;

public class Aladas extends Bestia {

    private int velocidad;

    public Aladas() {
    }

    public Aladas(int velocidad, int garras, boolean veneno, int vida) {
        super(garras, veneno, vida);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
