package laboratorio.pkg3;

public class Dragones extends Bestia{
    private int longitud;

    public Dragones() {
    }

    public Dragones(int longitud, int garras, boolean veneno, int vida) {
        super(garras, veneno, vida);
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Dragones{" + "longitud=" + longitud + '}';
    }
}
